import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();
        
        int units = B%10;
        int tens = (B/10)%10;
        int hundreds = (B/100)%10;
        
        System.out.println(A*units);
        System.out.println(A*tens);
        System.out.println(A*hundreds);
        System.out.println(A*B);
        
       
    }
}