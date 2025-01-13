import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        int arr1[] = {1,1,2,2,2,8};
        int arr2[] = new int[6];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr2.length; i++) {
        	arr2[i] = sc.nextInt();
        	arr1[i] -= arr2[i];
        }
        sc.close();
        
        for(int i=0; i<arr1.length; i++)
        	System.out.print(arr1[i]+" ");   
    }
}