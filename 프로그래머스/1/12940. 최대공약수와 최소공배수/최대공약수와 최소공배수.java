class Solution {
    public int[] solution(int n, int m) {
        return new int[]{getGCD(n, m), n / getGCD(n, m) * m};
    }

    private int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}