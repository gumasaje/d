class Solution {
    public int solution(int n) {
        String base3 = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(base3).reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}