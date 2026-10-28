class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            boolean isNegative = false;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    isNegative = true;
                    answer[i] = j - i;
                    break;
                }
            }

            if (!isNegative) {
                answer[i] = prices.length - i - 1;
            }
        }

        return answer;
    }
}