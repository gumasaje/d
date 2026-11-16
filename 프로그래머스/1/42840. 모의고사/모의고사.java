import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] counts = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) counts[0]++;
            if (answers[i] == second[i % second.length]) counts[1]++;
            if (answers[i] == third[i % third.length]) counts[2]++;
        }

        int max = 0;

        for (int count : counts) {
            if (max < count) max = count;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max) list.add(i + 1);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}