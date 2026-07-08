class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int[] score = new int[3];
        int i = 0;
        int round = 0;

        while (i < dartResult.length()) {
            if (i + 1 < dartResult.length() && dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                score[round] = 10;
                i += 2;
            } else {
                score[round] = dartResult.charAt(i) - '0';
                i++;
            }

            char bonus = dartResult.charAt(i);
            switch (bonus) {
                case 'D' -> score[round] = score[round] * score[round];
                case 'T' -> score[round] = score[round] * score[round] * score[round];
            }
            i++;

            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);

                switch (option) {
                    case '*' -> {
                        score[round] *= 2;
                        if (round > 0) score[round - 1] *= 2;
                        i++;
                    }
                    case '#' -> {
                        score[round] *= -1;
                        i++;
                    }
                }
            }

            round++;
        }

        for (int s : score) answer += s;

        return answer;
    }
}