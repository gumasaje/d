class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int location = 0;

        for (int i : section) {
            if (i > location) {
                answer++;
                location = i + m - 1;
            }
        }

        return answer;
    }
}