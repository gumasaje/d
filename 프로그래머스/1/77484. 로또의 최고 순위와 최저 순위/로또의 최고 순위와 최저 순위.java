class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        for (int i : lottos) {
            if (i == 0) {
                zeroCount++;
                continue;
            }
            for (int j : win_nums) {
                if (i == j)
                    count++;
            }
        }
        
        int maxMatch = count + zeroCount;
        int minMatch = count;

        answer[0] = rank(maxMatch);
        answer[1] = rank(minMatch);


        return answer;
    }

    private int rank(int count) {
        return count == 0 ? 6 : 7 - count;
    }
}