class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] matrix = createMatrix(rows, columns);

        int queryIndex = 0;

        for (int[] query : queries) {
            answer[queryIndex++] = rotateBorder(matrix, query);
        }

        return answer;
    }

    private int[][] createMatrix(int rows, int columns) {
        int value = 1;
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = value++;
            }
        }

        return matrix;
    }

    private int rotateBorder(int[][] matrix, int[] query) {
        int minValue = matrix.length * matrix[0].length;

        int startRow = query[0] - 1;
        int startCol = query[1] - 1;
        int endRow = query[2] - 1;
        int endCol = query[3] - 1;

        int[] rowDirections = {0, 1, 0, -1};
        int[] colDirections = {1, 0, -1, 0};
        int direction = 0;

        int currentRow = startRow;
        int currentCol = startCol;
        int currentValue = matrix[startRow][startCol];

        int height = endRow - startRow + 1;
        int width = endCol - startCol + 1;

        for (int i = 0; i < 2 * (height + width) - 4; i++) {
            int nextRow = currentRow + rowDirections[direction];
            int nextCol = currentCol + colDirections[direction];

            if (nextRow < startRow || nextRow > endRow
                    || nextCol < startCol || nextCol > endCol) {
                direction++;

                nextRow = currentRow + rowDirections[direction];
                nextCol = currentCol + colDirections[direction];
            }

            int nextValue = matrix[nextRow][nextCol];

            matrix[nextRow][nextCol] = currentValue;
            currentValue = nextValue;

            currentRow = nextRow;
            currentCol = nextCol;

            minValue = Math.min(minValue, currentValue);
        }

        return minValue;
    }
}