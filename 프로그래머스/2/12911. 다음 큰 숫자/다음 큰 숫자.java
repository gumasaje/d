class Solution {
    public int solution(int n) {
        int oneCount = 0;

        String binary = Integer.toBinaryString(n);
        for (char digit : binary.toCharArray()) {
            if (digit == '1') {
                oneCount++;
            }
        }

        while (true) {
            n++;
            
            int nextOneCount = 0;
            String nextBinary = Integer.toBinaryString(n);
            
            for (char digit : nextBinary.toCharArray()) {
                if (digit == '1') {
                    nextOneCount++;
                }
            }

            if (nextOneCount == oneCount) {
                return n;
            }
        }
    }
}