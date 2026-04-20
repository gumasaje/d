class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] counts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                counts[j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            answer += counts[i] > limit ? power : counts[i];
        }
        
        return answer;
    }
}