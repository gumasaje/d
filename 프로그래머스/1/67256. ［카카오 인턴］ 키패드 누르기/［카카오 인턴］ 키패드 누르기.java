class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;

        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {
            switch (number) {
                case 1, 4, 7 -> {
                    answer.append("L");
                    left = number;
                }

                case 3, 6, 9 -> {
                    answer.append("R");
                    right = number;
                }

                default -> {
                    int leftDistance = calculateDistance(left, number);
                    int rightDistance = calculateDistance(right, number);

                    if (leftDistance < rightDistance) {
                        answer.append("L");
                        left = number;
                    } else if (rightDistance < leftDistance) {
                        answer.append("R");
                        right = number;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            left = number;
                        } else {
                            answer.append("R");
                            right = number;
                        }
                    }
                }
            }
        }

        return answer.toString();
    }

    private int calculateDistance(int current, int goal) {
        if (current == 0) current = 11;
        if (goal == 0) goal = 11;

        int currentRow = (current - 1) / 3;
        int currentCol = (current - 1) % 3;

        int goalRow = (goal - 1) / 3;
        int goalCol = (goal - 1) % 3;

        return Math.abs(currentRow - goalRow) + Math.abs(currentCol - goalCol);
    }
}