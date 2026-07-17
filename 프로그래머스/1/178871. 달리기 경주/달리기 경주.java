import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranks = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            ranks.put(players[i], i);
        }

        for (String calledPlayer : callings) {
            int currentIndex = ranks.get(calledPlayer);
            int frontIndex = currentIndex - 1;

            String frontPlayer = players[frontIndex];

            players[frontIndex] = calledPlayer;
            players[currentIndex] = frontPlayer;

            ranks.put(calledPlayer, frontIndex);
            ranks.put(frontPlayer, currentIndex);
        }

        return players;
    }
}