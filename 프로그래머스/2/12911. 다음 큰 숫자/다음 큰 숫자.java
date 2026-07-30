class Solution {
    public int solution(int n) {
        int originalOneCount = Integer.bitCount(n);

        while (true) {
            n++;
            int candidateOneCount = Integer.bitCount(n);
            if (candidateOneCount == originalOneCount) {
                return n;
            }
        }
    }
}