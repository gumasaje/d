import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Factorial = 1;
        sc.close();
        
        for(int i=1; i<=N; i++)
            Factorial *= i;
        
        System.out.print(Factorial);
    }
}