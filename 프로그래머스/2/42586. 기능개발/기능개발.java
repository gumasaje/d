import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

            queue.offer(day);
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int count = 1;
            int deployDay = queue.poll();

            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                count++;
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}