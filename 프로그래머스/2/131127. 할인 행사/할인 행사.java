import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> target = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> discounted = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            discounted.merge(discount[i], 1, Integer::sum);
        }

        int answer = target.equals(discounted) ? 1 : 0;

        for (int i = 10; i < discount.length; i++) {
            String removed = discount[i - 10];
            String added = discount[i];

            discounted.compute(removed, (key, count) -> count == 1 ? null : count - 1);
            discounted.merge(added, 1, Integer::sum);

            if (target.equals(discounted)) {
                answer++;
            }
        }

        return answer;
    }
}