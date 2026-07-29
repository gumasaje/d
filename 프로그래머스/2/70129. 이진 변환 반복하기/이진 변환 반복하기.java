class Solution {
    public int[] solution(String s) {
        int removedZeroCount = 0;
        int conversionCount = 0;

        while (!s.equals("1")) {
            int oneCount = 0;

            for (char digit : s.toCharArray()) {
                if (digit == '1') oneCount++;
            }

            removedZeroCount += s.length() - oneCount;
            s = Integer.toBinaryString(oneCount);
            conversionCount++;
        }

        return new int[]{conversionCount, removedZeroCount};
    }
}