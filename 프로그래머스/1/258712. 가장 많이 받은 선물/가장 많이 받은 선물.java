import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int size = friends.length;

        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < size; i++) indexMap.put(friends[i], i);

        int[][] giftCount = new int[size][size];
        int[] giftScore = new int[size];

        for (String gift : gifts) {
            String[] names = gift.split(" ");

            int giver = indexMap.get(names[0]);
            int receiver = indexMap.get(names[1]);

            giftCount[giver][receiver]++;
            giftScore[giver]++;
            giftScore[receiver]--;
        }

        int[] nextGiftCount = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (giftCount[i][j] > giftCount[j][i]) nextGiftCount[i]++;
                else if (giftCount[i][j] < giftCount[j][i]) nextGiftCount[j]++;
                else if (giftScore[i] > giftScore[j]) nextGiftCount[i]++;
                else if (giftScore[i] < giftScore[j]) nextGiftCount[j]++;
            }
        }

        int answer = 0;

        for (int count : nextGiftCount) answer = Math.max(answer, count);

        return answer;
    }
}