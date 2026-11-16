import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;

        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1];
            int location = command[2] - 1;

            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);

            answer[index++] = temp[location];
        }

        return answer;
    }
}