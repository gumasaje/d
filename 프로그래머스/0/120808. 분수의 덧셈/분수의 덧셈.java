class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = 1;
        int min = Math.min(numer, denom);

        for (int i = min; i >= 1; i--) {
            if (numer % i == 0 && denom % i == 0) {
                gcd = i;
                break;
            }
        }
        int[] answer = {numer / gcd, denom / gcd};
        return answer;
    }
}