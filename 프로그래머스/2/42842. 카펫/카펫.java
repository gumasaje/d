class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int width = 1; width <= total; width++) {
            if (total % width != 0) continue;

            int height = total / width;

            if (width >= height && brown == 2 * (width + height - 2)) {
                return new int[]{width, height};
            }
        }

        return new int[]{};
    }
}