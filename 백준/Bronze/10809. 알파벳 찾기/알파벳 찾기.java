import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int arr[] = new int[26];
        for(int i=0; i<arr.length; i++)
            arr[i] = -1;
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(arr[ch-'a'] == -1)
                arr[ch-'a'] = i;
        }
        
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}