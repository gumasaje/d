import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int Array[] = new int[9];
        int max = 0;
        int N = 0;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<Array.length; i++){
            Array[i] = sc.nextInt();
            if(Array[i]>max){
                max = Array[i];
                N = i+1;
            }
        }
        sc.close();
        
        System.out.println(max);
        System.out.println(N);
    }
}