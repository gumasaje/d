import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0; i<arr.length; i++)
            arr[i] = i+1;
        
        for(int i=0; i<M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            while(I<J){
                int K = arr[I-1];
                arr[I-1] = arr[J-1];
                arr[J-1] = K;
                I++;
                J--;
            }
        }
        sc.close();
        
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}