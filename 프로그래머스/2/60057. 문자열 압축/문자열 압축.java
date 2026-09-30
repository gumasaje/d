class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            String previous = s.substring(0, unit);
            int count = 1;
            int compressedLength = 0;

            for (int start = unit; start < s.length(); start += unit) {
                String current = s.substring(start, Math.min(start + unit, s.length()));

                if (previous.equals(current)) {
                    count++;
                } else {
                    compressedLength = addCompressedLength(compressedLength, count, previous);
                    previous = current;
                    count = 1;
                }
            }

            compressedLength = addCompressedLength(compressedLength, count, previous);

            answer = Math.min(answer, compressedLength);
        }

        return answer;
    }

    private int addCompressedLength(int length, int count, String chunk) {
        if (count > 1) {
            length += String.valueOf(count).length();
        }
        
        length += chunk.length();

        return length;
    }
}