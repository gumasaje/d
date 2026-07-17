class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int employee = 0; employee < schedules.length; employee++) {
            int deadline = toMinutes(schedules[employee]) + 10;
            boolean success = true;

            for (int day = 0; day < 7; day++) {
                int currentDay = (startday - 1 + day) % 7 + 1;

                if (currentDay == 6 || currentDay == 7) continue;

                int arrivalTime = toMinutes(timelogs[employee][day]);

                if (arrivalTime > deadline) {
                    success = false;
                    break;
                }
            }

            if (success) answer++;
        }
        return answer;
    }

    private int toMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;

        return hour * 60 + minute;
    }
}