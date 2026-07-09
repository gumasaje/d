class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        int[] arr = new int[ingredient.length];
        int pointer = 0;

        for (int i = 0; i < ingredient.length; i++) {
            arr[pointer++] = ingredient[i];

            if (pointer >= 4) {
                if (arr[pointer - 1] == 1) {
                    if (arr[pointer - 2] == 3) {
                        if (arr[pointer - 3] == 2) {
                            if (arr[pointer - 4] == 1) {
                                pointer -= 4;
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}