import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        sc.close();
        
        if(M+T>=60){
            H = H+((M+T)/60);
            M = (M+T)%60;
            if(H>=24)
                H = H-24;
        }
        else
            M = M+T;
        System.out.print(H+" "+M);
    }
}