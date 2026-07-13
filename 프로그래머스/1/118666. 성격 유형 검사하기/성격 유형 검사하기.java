import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) map.put(c1, map.getOrDefault(c1, 0) + 4 - choice);
            if (choice > 4) map.put(c2, map.getOrDefault(c2, 0) + choice - 4);
        }

        String answer = String.valueOf(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T') +
                (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F') +
                (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M') +
                (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');

        return answer;
    }
}