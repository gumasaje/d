class Solution {
    public String solution(String code) {
        boolean mode = false;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
            }

            else {
                if(i % 2 == 0 && mode == false) {
                    ret.append(code.charAt(i));
                }
                else if(i % 2 != 0 && mode == true) {
                    ret.append(code.charAt(i));
                }
            }
        }

        if (ret.length() == 0) return "EMPTY";
        else return ret.toString();
    }
}