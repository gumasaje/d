import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int index = 0;
        int answer = 0;

        while (index < discount.length - 9) {

            Map<String, Integer> map2 = new HashMap<>();
            
            for (int i = index; i < 10 + index; i++) {
                map2.put(discount[i], map2.getOrDefault(discount[i], 0) + 1);
            }

            if (map.equals(map2)) {
                answer++;
            }

            index++;
        }

        return answer;
    }
}