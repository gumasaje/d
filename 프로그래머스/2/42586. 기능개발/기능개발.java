import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int day = remain / speeds[i];
            if(remain % speeds[i] != 0){
                day ++;
            }
            q.offer(day);
        }

        List<Integer> answerList = new ArrayList<>();

        while(!q.isEmpty()) {
            int count = 1;
            int x = q.poll();

            while(!q.isEmpty() && q.peek() <= x) {
                q.poll();
                count++;
            }

            answerList.add(count);
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}