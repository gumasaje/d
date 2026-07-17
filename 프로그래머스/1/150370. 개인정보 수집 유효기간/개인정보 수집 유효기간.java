import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        int todayDays = convertToDays(today);
        List<Integer> expired = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");

            String collectedDate = parts[0];
            String termType = parts[1];

            int collectedDays = convertToDays(collectedDate);
            int validDays = termMap.get(termType) * 28;

            if (collectedDays + validDays <= todayDays) {
                expired.add(i + 1);
            }
        }

        return expired.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int convertToDays(String date) {
        String[] parts = date.split("\\.");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return year * 12 * 28 + month * 28 + day;
    }
}