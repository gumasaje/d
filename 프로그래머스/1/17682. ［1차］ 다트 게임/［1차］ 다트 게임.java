class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int[] score = new int[3];
        int i = 0;
        int round = 0;

        while (i < dartResult.length()) {
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                score[round] += 10;
                i += 2;
            } else {
                score[round] += dartResult.charAt(i) - '0';
                i++;
            }

            switch (dartResult.charAt(i)) {
                case 'D' -> score[round] = score[round] * score[round];
                case 'T' -> score[round] = score[round] * score[round] * score[round];
            }
            i++;

            if (i < dartResult.length() && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')) {
                if (dartResult.charAt(i) == '*') {
                    score[round] *= 2;
                    if (round > 0) score[round - 1] *= 2;
                } else if (dartResult.charAt(i) == '#') {
                    score[round] *= -1;
                }
                i++;
            }

            round++;
        }

        for (i = 0; i < score.length; i++) {
            answer += score[i];
        }

        return answer;
    }
}