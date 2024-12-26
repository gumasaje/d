import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int mod[] = new int[10];
        
        for(int i=0; i<10; i++)
            mod[i] = sc.nextInt()%42;
        sc.close();
        
        for(int i=0; i<10; i++){
            int temp = 0;
            for(int j=i+1; j<10; j++){
                if(mod[i]==mod[j])
                    temp++;
            }
            if(temp==0)
                count++;
        }
        System.out.print(count);
    }
}