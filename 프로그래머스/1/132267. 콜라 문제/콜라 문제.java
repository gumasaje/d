class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottles = n;

        while (bottles >= a) {
            answer += b * (bottles / a);
            bottles = bottles - a * (bottles / a) + b * (bottles / a);
        }

        return answer;
    }
}