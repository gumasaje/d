import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N[] = new int[n];
        
        for(int i=0; i<N.length; i++)
            N[i] = sc.nextInt();
        
        int v = sc.nextInt();
        sc.close();
        
        for(int j=0; j<N.length; j++){
            if(N[j]==v)
                count++;
        }
        System.out.print(count);
    }
}