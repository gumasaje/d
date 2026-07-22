import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        boolean[] isSpoiler = new boolean[message.length()];

        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) isSpoiler[i] = true;
        }

        Set<String> spoilerWords = new HashSet<>();
        Set<String> normalWorlds = new HashSet<>();

        int start = 0;

        while (start < message.length()) {
            int end = start;
            boolean containsSpoiler = false;

            while (end < message.length() && message.charAt(end) != ' ') {
                if (isSpoiler[end]) containsSpoiler = true;

                end++;
            }

            String word = message.substring(start, end);

            if (containsSpoiler) spoilerWords.add(word);
            else normalWorlds.add(word);

            start = end + 1;
        }

        spoilerWords.removeAll(normalWorlds);

        return spoilerWords.size();
    }
}