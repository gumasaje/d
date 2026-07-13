import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) map.merge(c1, 4 - choice, Integer::sum);
            else if (choice > 4) map.merge(c2, choice - 4, Integer::sum);
        }

        StringBuilder sb = new StringBuilder();

        sb.append(compare(map, 'R', 'T'));
        sb.append(compare(map, 'C', 'F'));
        sb.append(compare(map, 'J', 'M'));
        sb.append(compare(map, 'A', 'N'));

        return sb.toString();
    }

    private char compare(Map<Character, Integer> map, char a, char b) {
        int scoreA = map.getOrDefault(a, 0);
        int scoreB = map.getOrDefault(b, 0);

        return scoreA >= scoreB ? a : b;
    }
}