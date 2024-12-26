import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Array[] = new int[N];
        
        for(int i=0; i<Array.length; i++)
            Array[i] = sc.nextInt();
        sc.close();
        
        int max = Array[0];
        int min = Array[0];
        
        for(int j=0; j<Array.length; j++){
            if(Array[j]<min)
                min = Array[j];
        }
        
        for(int k=0; k<Array.length; k++){
            if(Array[k]>max)
                max = Array[k];
        }
        
        System.out.print(min+" "+max);
    }
}