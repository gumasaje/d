class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];

        for (int row = 0; row < m; row++) {
            map[row] = board[row].toCharArray();
        }

        int answer = 0;

        while (true) {
            boolean[][] removed = new boolean[m][n];
            boolean found = false;

            for (int row = 0; row < m - 1; row++) {
                for (int col = 0; col < n - 1; col++) {
                    char block = map[row][col];

                    if (block != ' '
                            && block == map[row][col + 1]
                            && block == map[row + 1][col]
                            && block == map[row + 1][col + 1]
                    ) {
                        removed[row][col] = true;
                        removed[row][col + 1] = true;
                        removed[row + 1][col] = true;
                        removed[row + 1][col + 1] = true;

                        found = true;
                    }
                }
            }

            if (!found) break;

            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    if (removed[row][col]) {
                        map[row][col] = ' ';
                        answer++;
                    }
                }
            }

            applyGravity(map, m, n);
        }

        return answer;
    }

    private void applyGravity(char[][] map, int m, int n) {

        for (int col = 0; col < n; col++) {
            int writeRow = m - 1;

            for (int row = m - 1; row >= 0; row--) {
                if (map[row][col] == ' ') continue;

                map[writeRow][col] = map[row][col];

                if (writeRow != row) {
                    map[row][col] = ' ';
                }

                writeRow--;
            }
        }
    }
}