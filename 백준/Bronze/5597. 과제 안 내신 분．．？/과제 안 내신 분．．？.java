import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int student[] = new int[30];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<28; i++){
            int pass = sc.nextInt();
            student[pass-1] = 1;
        }
        sc.close();
        
        for(int i=0; i<student.length; i++){
            if(student[i] != 1)
                System.out.println(i+1);
        }
    }
        
}