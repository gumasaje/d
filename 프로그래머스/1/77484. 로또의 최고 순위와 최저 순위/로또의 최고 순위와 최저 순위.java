import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : lottos) {
            if (i == 0) zeroCount++;
            else set.add(i);
        }

        for (int i : win_nums) if (set.contains(i)) count++;

        int maxMatch = count + zeroCount;
        int minMatch = count;

        return new int[]{getRank(maxMatch), getRank(minMatch)};
    }

    private int getRank(int count) {
        return count == 0 ? 6 : 7 - count;
    }
}