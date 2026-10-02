class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] matrix = new int[rows][columns];
        int index = 1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = index++;
            }
        }

        int rotationCount = 0;

        for (int[] query : queries) {
            int x1 = query[0] - 1, y1 = query[1] - 1, x2 = query[2] - 1, y2 = query[3] - 1;

            int temp = matrix[x1][y1];
            int min = rows * columns;

            for (int i = y1; i < y2; i++) {
                int next = matrix[x1][i + 1];
                matrix[x1][i + 1] = temp;
                temp = next;
                min = Math.min(min, temp);
            }

            for (int i = x1; i < x2; i++) {
                int next = matrix[i + 1][y2];
                matrix[i + 1][y2] = temp;
                temp = next;
                min = Math.min(temp, min);
            }

            for (int i = y2; i > y1; i--) {
                int next = matrix[x2][i - 1];
                matrix[x2][i - 1] = temp;
                temp = next;
                min = Math.min(temp, min);
            }

            for (int i = x2; i > x1; i--) {
                int next = matrix[i - 1][y1];
                matrix[i - 1][y1] = temp;
                temp = next;
                min = Math.min(temp, min);
            }

            answer[rotationCount++] = min;
        }

        return answer;
    }
}