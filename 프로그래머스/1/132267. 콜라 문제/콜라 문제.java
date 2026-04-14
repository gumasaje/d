class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newBottles = b * (n / a);
            answer += newBottles;
            n = n % a + newBottles;
        }

        return answer;
    }
}