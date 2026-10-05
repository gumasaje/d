import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int move : moves) {
            for (int rows = 0; rows < board.length; rows++) {
                int doll = board[rows][move - 1];

                if (doll != 0) {
                    if (!deque.isEmpty() && doll == deque.peek()) {
                        deque.pop();
                        board[rows][move - 1] = 0;
                        answer += 2;
                        break;
                    } else {
                        deque.push(doll);
                        board[rows][move - 1] = 0;
                        break;
                    }
                }
            }

        }

        return answer;
    }
}