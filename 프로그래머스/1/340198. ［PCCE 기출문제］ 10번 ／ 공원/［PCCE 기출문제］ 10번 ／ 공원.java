import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int height = park.length;
        int width = park[0].length;

        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];

            for (int row = 0; row + size <= height; row++) {
                for (int col = 0; col + size <= width; col++) {
                    if (canPlace(park, row, col, size)) return size;
                }
            }
        }

        return -1;
    }

    private boolean canPlace(String[][] park, int startRow, int startCol, int size) {
        for (int row = startRow; row < startRow + size; row++) {
            for (int col = startCol; col < startCol + size; col++) {
                if (!park[row][col].equals("-1")) {
                    return false;
                }
            }
        }

        return true;
    }
}