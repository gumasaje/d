class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp * (i + 1);
        }

        return answer;
    }
}