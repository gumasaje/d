import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        
        if(H==0){
            if(M<45){
                H = H+24-1;
                M = M+60-45;
            }
            else
                M = M-45;
        }
        else{
            if(M<45){
                H = H-1;
                M = M+60-45;
            }
            else
                M = M-45;
        }
        System.out.print(H+" "+M);
    }
}