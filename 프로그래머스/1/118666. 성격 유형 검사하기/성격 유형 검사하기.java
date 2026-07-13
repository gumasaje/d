class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[26];

        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) {
                scores[first - 'A'] += 4 - choice;
            } else if (choice > 4) {
                scores[second - 'A'] += choice - 4;
            }
        }

        StringBuilder answer = new StringBuilder(4);
        answer.append(compare(scores, 'R', 'T'));
        answer.append(compare(scores, 'C', 'F'));
        answer.append(compare(scores, 'J', 'M'));
        answer.append(compare(scores, 'A', 'N'));

        return answer.toString();
    }

    private char compare(int[] scores, char first, char second) {
        return scores[first - 'A'] >= scores[second - 'A']
                ? first
                : second;
    }
}