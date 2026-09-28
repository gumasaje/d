class Solution {
    public String solution(String m, String[] musicinfos) {
        String targetMelody = normalize(m);

        String answerTitle = "(None)";
        int longestPlayTime = -1;

        for (String musicinfo : musicinfos) {
            String[] music = musicinfo.split(",");

            int startTime = calculateTime(music[0]);
            int endTime = calculateTime(music[1]);
            int playTime = endTime - startTime;

            String title = music[2];
            String melody = normalize(music[3]);
            String playedMelody = createdPlayedMelody(melody, playTime);

            if (playedMelody.contains(targetMelody) && playTime > longestPlayTime) {
                answerTitle = title;
                longestPlayTime = playTime;

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

    private String createdPlayedMelody(String melody, int playTime) {
        StringBuilder playedMelody = new StringBuilder();

        for (int i = 0; i < playTime; i++) {
            playedMelody.append(melody.charAt(i % melody.length()));
        }

        return playedMelody.toString();
    }
}