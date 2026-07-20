import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> indexMap = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();
        Set<String> uniqueReports = new HashSet<>();

        for (int i = 0; i < id_list.length; i++) indexMap.put(id_list[i], i);

        for (String reportInfo : report) uniqueReports.add(reportInfo);

        for (String reportInfo : uniqueReports) {
            String[] users = reportInfo.split(" ");
            String reportedUser = users[1];

            reportCount.merge(reportedUser, 1, Integer::sum);
        }

        for (String reportInfo : uniqueReports) {
            String[] users = reportInfo.split(" ");
            String reporter = users[0];
            String reportedUser = users[1];

            if (reportCount.getOrDefault(reportedUser, 0) >= k) answer[indexMap.get(reporter)]++;
        }

        return answer;
    }
}