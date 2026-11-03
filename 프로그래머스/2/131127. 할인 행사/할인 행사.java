import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> target = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> window = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            window.merge(discount[i], 1, Integer::sum);
        }

        int answer = target.equals(window) ? 1 : 0;

        for (int i = 10; i < discount.length; i++) {
            String removed =  discount[i - 10];
            String added = discount[i];

            window.compute(removed, (key, count) ->
                    count == 1 ? null : count - 1);

            window.merge(added, 1, Integer::sum);

            if (target.equals(window)) {
                answer++;
            }
        }

        return answer;
    }
}