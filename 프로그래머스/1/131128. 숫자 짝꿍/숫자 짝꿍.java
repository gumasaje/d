import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();

        for (char c : X.toCharArray()) {
            xMap.put(c, xMap.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            yMap.put(c, yMap.getOrDefault(c, 0) + 1);
        }


        for (int i = 9; i >= 0; i--) {
            char digitChar = (char) (i + '0');

            int xCount = xMap.getOrDefault(digitChar, 0);
            int yCount = yMap.getOrDefault(digitChar, 0);

            int count = Math.min(xCount, yCount);

            answer.repeat(String.valueOf(i), Math.max(0, count));
        }

        if (answer.isEmpty()) return "-1";
        if (answer.charAt(0) == '0') return "0";

        return answer.toString();
    }
}