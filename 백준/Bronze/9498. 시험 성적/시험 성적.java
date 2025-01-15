import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		if(90 <= score && score <= 100)
			System.out.print('A');
		else if(80 <= score && score <= 89)
			System.out.print('B');
		else if(70 <= score && score <= 79)
			System.out.print('C');
		else if(60 <= score && score <= 69)
			System.out.print('D');
		else
			System.out.print('F');
		
	}
}