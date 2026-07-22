class Solution {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w;

        int targetIndex = num - 1;
        int targetRow = targetIndex / w;
        int targetOffset = targetIndex % w;

        int targetCol = targetRow % 2 == 0 ? targetOffset : w - 1 - targetOffset;

        int answer = height - targetRow;

        int topRow = height - 1;
        int topBox = topRow % 2 == 0 ? topRow * w + targetCol + 1 : (topRow + 1) * w - targetCol;

        if (topBox > n) answer--;

        return answer;
    }
}