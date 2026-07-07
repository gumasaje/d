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

        int index = 0;
        for (String target : targets) {
            int count = 0;
            for (int i = 0; i < target.length(); i++) {
                if (map.containsKey(target.charAt(i))) {
                    count += map.get(target.charAt(i));
                } else {
                    count = -1;
                    break;
                }
            }
            answer[index++] = count;
        }

        return answer;
    }
}