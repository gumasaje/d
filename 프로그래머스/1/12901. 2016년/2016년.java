class Solution {
    public String solution(int a, int b) {
        int months[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for (int i = 0; i < a - 1; i++) {
            days += months[i];
        }
        days += b;

        String[] arr = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        return arr[days % 7];
    }
}