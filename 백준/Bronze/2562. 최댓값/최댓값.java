import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        int arr[] = new int[9];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        sc.close();
        
        int max = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                count = i+1;
            }
        }
        
        System.out.println(max);
        System.out.print(count);
    }
}