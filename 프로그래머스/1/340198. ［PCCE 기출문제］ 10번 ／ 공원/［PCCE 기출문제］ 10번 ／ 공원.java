import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int rows = park.length;
        int cols = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            if (size > rows || size > cols) continue;

            for (int r = 0; r <= rows - size; r++) {
                for (int c = 0; c <= cols - size; c++) {
                    boolean canPlace = true;

                    for (int y = r; y < r + size && canPlace; y++) {
                        for (int x = c; x < c + size; x++) {
                            if (!park[y][x].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                    }

                    if (canPlace) return size;
                }
            }
        }

        return -1;
    }
}