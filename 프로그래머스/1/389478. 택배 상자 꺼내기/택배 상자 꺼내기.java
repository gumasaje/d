class Solution {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w;
        int[][] warehouse = new int[height][w];

        for (int box = 1; box <= n; box++) {
            int index = box - 1;
            int row = index / w;
            int offset = index % w;

            int col = row % 2 == 0 ? offset : w - 1 - offset;

            warehouse[row][col] = box;
        }

        int targetIndex = num - 1;
        int targetRow = targetIndex / w;
        int targetOffset = targetIndex % w;

        int targetCol = targetRow % 2 == 0 ? targetOffset : w - 1 - targetOffset;

        int answer = 0;

        for (int row = targetRow; row < height; row++) {
            if (warehouse[row][targetCol] != 0) answer++;
        }
        
        return answer;
    }
}