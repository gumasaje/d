class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;

        for (String str : goal) {
            if (cards1Index < cards1.length && str.equals(cards1[cards1Index])) {
                cards1Index++;
            } else if (cards2Index < cards2.length && str.equals(cards2[cards2Index])) {
                cards2Index++;
            } else return "No";
        }
        return "Yes";
    }
}