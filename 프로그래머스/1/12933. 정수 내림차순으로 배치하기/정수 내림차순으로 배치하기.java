import java.util.Arrays;

class Solution {
    public long solution(long n) {

        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}