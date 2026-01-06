import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i : arr) {
            if(q.isEmpty() || q.peekLast() != i) {
                q.offer(i);
            }
        }
        
        int[] answer = new int[q.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }

        return answer;
    }
}