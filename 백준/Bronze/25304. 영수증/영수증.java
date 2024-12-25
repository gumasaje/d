import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        sc.close();
        
        if(sum==X)
            System.out.print("Yes");
        else
            System.out.print("No");
        
    }
}