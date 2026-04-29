class Solution {
    public int solution(String s) {
        int answer = 0;
        int thisCount = 0;
        int otherCount = 0;
        char c = ' ';
        
        for (char current : s.toCharArray()) {
            if (thisCount == 0) {
                c = current;
            }
            
            if (current == c) thisCount++;
            else otherCount++;
            
            if (thisCount == otherCount) {
                answer++;
                thisCount = 0;
                otherCount = 0;
            }
        }
        
        if (thisCount != 0) answer++;

        return answer;
    }
}