class Solution {
    public String solution(String m, String[] musicinfos) {
        String normalizedM = normalize(m);

        String answerTitle = "(None)";
        int answerPlayTime = -1;

        for (String musicinfo : musicinfos) {
            String[] music = musicinfo.split(",");

            int start = calculateTime(music[0]);
            int end = calculateTime(music[1]);
            int playTime = end - start;

            String title = music[2];
            String notes = normalize(music[3]);

            StringBuilder playedNotes = new StringBuilder(notes.repeat(playTime / notes.length()));

            for (int i = 0; i < playTime % notes.length(); i++) {
                playedNotes.append(notes.charAt(i));
            }

            if (playedNotes.toString().contains(normalizedM)) {
                if (playTime > answerPlayTime) {
                    answerTitle = title;
                    answerPlayTime = playTime;
                }

            }
        }

        return answerTitle;
    }

    private int calculateTime(String time) {
        String[] times = time.split(":");

        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }

    private String normalize(String melody) {
        return melody
                .replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
    }
}