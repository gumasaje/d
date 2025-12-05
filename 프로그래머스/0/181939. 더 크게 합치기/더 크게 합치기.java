class Solution {
    public int solution(int a, int b) {
        StringBuilder sb =  new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb.append(a);
        sb.append(b);
        
        sb2.append(b);
        sb2.append(a);
        
        if(Integer.parseInt(sb.toString()) > Integer.parseInt(sb2.toString())) return Integer.parseInt(sb.toString());
        else if(Integer.parseInt(sb.toString()) < Integer.parseInt(sb2.toString())) return Integer.parseInt(sb2.toString());
        else return Integer.parseInt(sb.toString());
    }
}