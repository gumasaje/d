import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prize = 0;
        sc.close();
        
        if(a==b && b==c)
            prize = 10000+(a*1000);
        else if(a==b || a==c)
            prize = 1000+(a*100);
        else if(b==c)
            prize = 1000+(b*100);
        else if(a>b && a>c)
            prize = a*100;
        else if(b>a && b>c)
            prize = b*100;
        else if(c>a && c>b)
            prize = c*100;
        
        System.out.print(prize);
    }
}