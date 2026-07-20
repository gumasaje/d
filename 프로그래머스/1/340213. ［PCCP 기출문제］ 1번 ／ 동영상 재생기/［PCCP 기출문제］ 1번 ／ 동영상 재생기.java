class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = toSeconds(video_len);
        int position = toSeconds(pos);
        int openingStart = toSeconds(op_start);
        int openingEnd = toSeconds(op_end);

        int currentPosition = moveAfterOpening(position, openingStart, openingEnd);

        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosition -= 10;

                if (currentPosition < 0) currentPosition = 0;
            } else if (command.equals("next")) {
                currentPosition += 10;

                if (currentPosition > videoLength) currentPosition = videoLength;
            }

            currentPosition = moveAfterOpening(currentPosition, openingStart, openingEnd);
        }

        return toTimeString(currentPosition);
    }

    private int toSeconds(String time) {
        String[] time_array = time.split(":");
        return Integer.parseInt(time_array[0]) * 60 + Integer.parseInt(time_array[1]);
    }

    private int moveAfterOpening(int pos, int op_start, int op_end) {
        return op_start <= pos && pos <= op_end ? op_end : pos;
    }

    private String toTimeString(int pos) {
        String minute = String.valueOf(pos / 60);
        String second = String.valueOf(pos % 60);

        if (minute.length() == 1) minute = "0" + minute;
        if (second.length() == 1) second = "0" + second;

        return minute + ":" + second;
    }
}