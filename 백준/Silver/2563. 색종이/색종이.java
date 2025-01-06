import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[100][100];
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    arr[x+j][y+k]++;
                    if(arr[x+j][y+k] == 1)
                        count ++;
                }
            }
        }
        sc.close();
        System.out.print(count);
    }
}