class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            String binary = Integer.toBinaryString(combined);
            
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n - binary.length(); j++) {
                sb.append(" ");
            }
            
            for (char c : binary.toCharArray()) {
                sb.append(c == '1' ? "#" : " ");
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}