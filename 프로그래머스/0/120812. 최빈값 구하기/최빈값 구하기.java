import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int countMax = 0;
        int answer = 0;
        boolean isDuplicate = false;

        for (int key : map.keySet()) {
            int count = map.get(key);

            if (count > countMax) {
                countMax = count;
                answer = key;
                isDuplicate = false;
            } else if (count == countMax) {
                isDuplicate = true;
            }
        }
        
        return isDuplicate ? -1 : answer;
    }
}