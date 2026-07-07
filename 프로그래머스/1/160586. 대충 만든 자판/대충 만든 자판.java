import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                map.merge(key.charAt(i), i + 1, Math::min);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int count = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                Integer pressCount = map.get(targets[i].charAt(j));

                if (pressCount == null) {
                    count = -1;
                    break;
                }

                count += pressCount;
            }

            answer[i] = count;
        }

        return answer;
    }
}