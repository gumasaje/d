class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = toSeconds(video_len);
        int currentPosition = toSeconds(pos);
        int openingStart = toSeconds(op_start);
        int openingEnd = toSeconds(op_end);

        currentPosition = moveAfterOpening(currentPosition, openingStart, openingEnd);

        for (String command : commands) {
            if (command.equals("prev")) currentPosition = Math.max(0, currentPosition - 10);
            else if (command.equals("next")) currentPosition = Math.min(videoLength, currentPosition + 10);

            currentPosition = moveAfterOpening(currentPosition, openingStart, openingEnd);
        }

        return toTimeString(currentPosition);
    }

    private int toSeconds(String time) {
        String[] timeParts = time.split(":");

        return Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);
    }

    private int moveAfterOpening(int position, int openingStart, int openingEnd) {
        return openingStart <= position && position <= openingEnd ? openingEnd : position;
    }

    private String toTimeString(int position) {
        return String.format("%02d:%02d", position / 60, position % 60);
    }
}