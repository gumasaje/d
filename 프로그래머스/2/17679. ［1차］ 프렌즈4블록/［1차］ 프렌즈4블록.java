import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = board[i].charAt(j);
            }
        }

        while (true) {
            boolean isRemoved = false;
            boolean[][] removed = new boolean[m][n];

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (map[i][j] != ' '
                            && map[i][j] == map[i][j + 1]
                            && map[i][j] == map[i + 1][j]
                            && map[i][j] == map[i + 1][j + 1]
                    ) {
                        isRemoved = true;
                        removed[i][j] = true;
                        removed[i][j + 1] = true;
                        removed[i + 1][j] = true;
                        removed[i + 1][j + 1] = true;
                    }
                }
            }

            if (!isRemoved) {
                break;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (removed[i][j]) {
                        map[i][j] = ' ';
                        answer++;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                Deque<Character> queue = new ArrayDeque<>();
                for (int i = 0; i < m; i++) {
                    if (map[i][j] != ' ') {
                        queue.offer(map[i][j]);
                    }

                    map[i][j] = ' ';
                }

                int start = m - queue.size();
                for (int i = start; i < m; i++) {
                    map[i][j] = queue.poll();
                }
            }
        }

        return answer;
    }
}