import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int filterIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);

        List<int[]> filteredRows = new ArrayList<>();

        for (int[] row : data) {
            if (row[filterIndex] < val_ext) {
                filteredRows.add(row);
            }
        }

        filteredRows.sort(Comparator.comparingInt(row -> row[sortIndex]));

        int[][] answer = new int[filteredRows.size()][data[0].length];

        for (int i = 0; i < filteredRows.size(); i++) {
            answer[i] = filteredRows.get(i);
        }

        return answer;
    }

    private int getIndex(String column) {
        return switch (column) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> throw new IllegalStateException();
        };
    }
}