class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            String previous = s.substring(0, unit);
            int count = 1;

            StringBuilder sb = new StringBuilder();

            for (int i = unit; i < s.length(); i += unit) {
                String current = s.substring(i, Math.min(i + unit, s.length()));

                if (previous.equals(current)) {
                    count++;
                } else {
                    if (count == 1) {
                        sb.append(previous);
                    } else {
                        sb.append(count).append(previous);
                    }

                    previous = current;
                    count = 1;
                }
            }

            if (count == 1) {
                sb.append(previous);
            } else {
                sb.append(count).append(previous);
            }

            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}