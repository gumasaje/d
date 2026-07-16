class Solution {
    public String solution(String newId) {
        String answer = newId.toLowerCase();

        StringBuilder filtered = new StringBuilder();

        for (char c : answer.toCharArray()) {
            if (Character.isLowerCase(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '.') {
                filtered.append(c);
            }
        }

        StringBuilder compressed = new StringBuilder();

        for (char c : filtered.toString().toCharArray()) {
            if (c == '.'
                    && !compressed.isEmpty()
                    && compressed.charAt(compressed.length() - 1) == '.') {
                continue;
            }

            compressed.append(c);
        }

        answer = compressed.toString();

        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }

        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        if (answer.isEmpty()) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        StringBuilder result = new StringBuilder(answer);

        while (result.length() < 3) {
            result.append(result.charAt(result.length() - 1));
        }

        return result.toString();
    }
}