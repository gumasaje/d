import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return new StringBuilder("김서방은 ").append(Arrays.asList(seoul).indexOf("Kim")).append("에 있다").toString();
    }
}