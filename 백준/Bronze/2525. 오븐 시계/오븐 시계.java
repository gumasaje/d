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
		int T = Integer.parseInt(br.readLine());
		
		if((B+T)>=60) {
			A += (B+T)/60;
			B = (B+T)%60;
			if(A>=24)
				A -= 24;
		}
		
		else
			B += T;
		
		System.out.print(A+" "+B);
		
	}
}