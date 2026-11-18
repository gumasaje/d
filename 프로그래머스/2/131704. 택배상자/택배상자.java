import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int box = 1; box <= order.length; box++) {
            stack.push(box);

            while (!stack.isEmpty() && stack.peek() == order[answer]) {
                stack.pop();
                answer++;
            }
        }

        return answer;
    }
}