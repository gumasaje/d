class Solution {
    public int solution(int n) {
        int answer = 0;

        int divisor = 1;

        while (divisor * divisor <= n) {
            if (n % divisor == 0) {
                int pairedDivisor = n / divisor;

                if (divisor % 2 != 0) answer++;
                if (pairedDivisor % 2 != 0 && pairedDivisor != divisor) answer++;
            }
            divisor++;
        }
        return answer;
    }
}