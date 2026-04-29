import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List<Character> characters = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            if (skip.indexOf(c) == -1) {
                characters.add(c);
            }
        }

        for (char target : s.toCharArray()) {
            int currentIndex = characters.indexOf(target);
            int nextIndex = (currentIndex + index) % characters.size();

            answer.append(characters.get(nextIndex));
        }
        
        return answer.toString();
    }
}