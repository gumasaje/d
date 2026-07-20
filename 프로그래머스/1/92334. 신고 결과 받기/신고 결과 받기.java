import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> indexMap = new HashMap<>();
        Map<String, Set<String>> reportHistory = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            indexMap.put(id_list[i], i);
            reportHistory.put(id_list[i], new HashSet<>());
        }

        for (String reportInfo : report) {
            String[] users = reportInfo.split(" ");
            String reporter = users[0];
            String reportedUser = users[1];

            Set<String> reportedUsers = reportHistory.get(reporter);

            if (reportedUsers.add(reportedUser)) reportCount.merge(reportedUser, 1, Integer::sum);
        }

        for (String reporter : id_list) {
            for (String reportedUser : reportHistory.get(reporter))
                if (reportCount.getOrDefault(reportedUser, 0) >= k) answer[indexMap.get(reporter)]++;
        }

        return answer;
    }
}