class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int combinedNumer = numer1 * denom2 + numer2 * denom1;
        int combinedDenom = denom1 * denom2;

        int gcd = getGCD(combinedNumer, combinedDenom);

        return new int[]{combinedNumer / gcd, combinedDenom / gcd};
    }

    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}