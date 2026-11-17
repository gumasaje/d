class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int width = 1; width <= total; width++) {
            int height = total / width;

            if (brown == (width + height - 2) * 2 && width >= height) {
                return new int[]{width, height};
            }
        }

        return new int[]{};
    }
}