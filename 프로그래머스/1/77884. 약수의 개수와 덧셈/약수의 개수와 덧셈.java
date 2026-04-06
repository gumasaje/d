class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int countDivisors = countDivisors(i);
            answer += countDivisors % 2 == 0 ? i : -i;
        }

        return answer;
    }

    private static int countDivisors(int num) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        
        return count;
    }
}