class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        for (int i : lottos) {
            if (i == 0)
                zeroCount++;
            for (int j : win_nums) {
                if (i == j)
                    count++;
            }
        }

        answer[0] = rank(count + zeroCount);
        answer[1] = rank(count);


        return answer;
    }

    private int rank(int count) {
        if (count == 0)
            return 6;
        return 7 - count;
    }
}