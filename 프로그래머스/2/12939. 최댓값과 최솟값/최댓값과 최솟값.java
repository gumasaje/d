class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");

        int min = Integer.parseInt(numbers[0]);
        int max = min;

        for (int i = 1; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        return min + " " + max;
    }
}