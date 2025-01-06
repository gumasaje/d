import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double arr[] = new double[N];
        
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        sc.close();
        
        double max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
      
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        
        double avg = sum/N;
        System.out.print(avg);
    }
}