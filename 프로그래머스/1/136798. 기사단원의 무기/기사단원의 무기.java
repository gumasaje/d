class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int attackPower = countDivisors(i);
            answer += attackPower > limit ? power : attackPower;
        }
        return answer;
    }

    private int countDivisors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count += i * i == n ? 1 : 2;
            }
        }
        return count;
    }
}