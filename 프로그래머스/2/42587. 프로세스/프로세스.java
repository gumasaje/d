import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean hasHigherPriority = false;

            for (int index : queue) {
                if (priorities[index] > priorities[current]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current);
            } else {
                answer++;

                if (current == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}