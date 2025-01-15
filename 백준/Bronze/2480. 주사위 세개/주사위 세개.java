import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int prize = 0;
		
		if(A==B && A==C)
			prize = 10000 + (A*1000);
		else if(A==B || A==C)
			prize = 1000 + (A*100);
		else if(B==C)
			prize = 1000 + (B*100);
		else if(A>B && A>C)
			prize = A*100;
		else if(B>A && B>C)
			prize = B*100;
		else
			prize = C*100;
		
		System.out.print(prize);
		
	}
}