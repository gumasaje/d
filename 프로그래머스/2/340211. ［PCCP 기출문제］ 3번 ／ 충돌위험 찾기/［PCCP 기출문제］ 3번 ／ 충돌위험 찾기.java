import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<List<String>> robotPaths = new ArrayList<>();

        for (int[] route : routes) {
            List<String> robotPath = new ArrayList<>();

            for (int j = 0; j < route.length - 1; j++) {
                int fromPoint = route[j];
                int toPoint = route[j + 1];

                int currentR = points[fromPoint - 1][0];
                int currentC = points[fromPoint - 1][1];

                int targetR = points[toPoint - 1][0];
                int targetC = points[toPoint - 1][1];

                List<String> sectionPath = createPath(currentR, currentC, targetR, targetC);

                if (robotPath.isEmpty()) {
                    robotPath.addAll(sectionPath);
                } else {
                    robotPath.addAll(sectionPath.subList(1, sectionPath.size()));
                }
            }

            robotPaths.add(robotPath);
        }

        int maxPathLength = 0;
        for (List<String> path : robotPaths) {
            maxPathLength = Math.max(maxPathLength, path.size());
        }

        for (int time = 0; time < maxPathLength; time++) {
            Map<String, Integer> positionCounts = new HashMap<>();

            for (List<String> path : robotPaths) {
                if (time >= path.size()) continue;

                positionCounts.merge(path.get(time), 1, Integer::sum);
            }

            for (int robotCount : positionCounts.values()) {
                if (robotCount >= 2) answer++;
            }
        }
        return answer;
    }

    private List<String> createPath(int r, int c, int targetR, int targetC) {
        List<String> path = new ArrayList<>();

        path.add(r + "," + c);

        while (r != targetR) {
            if (r < targetR) r++;
            else r--;

            path.add(r + "," + c);
        }

        while (c != targetC) {
            if (c < targetC) c++;
            else c--;

            path.add(r + "," + c);
        }

        return path;
    }
}