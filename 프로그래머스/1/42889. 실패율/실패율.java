import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] counts = new int[N + 2];

        for (int i : stages) {
            counts[i]++;
        }

        int players = stages.length;
        List<Stage> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (players == 0)
                list.add(new Stage(i, 0.0));
            else {
                double ratio = (double) counts[i] / players;
                list.add(new Stage(i, ratio));
                players -= counts[i];
            }
        }
        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).number;
        }

        return answer;
    }

    private static class Stage implements Comparable<Stage> {
        int number;
        double failRatio;

        public Stage(int number, double failRatio) {
            this.number = number;
            this.failRatio = failRatio;
        }

        @Override
        public int compareTo(Stage o) {
            if (this.failRatio == o.failRatio) {
                return Integer.compare(this.number, o.number);
            }
            return Double.compare(o.failRatio, this.failRatio);
        }
    }
}