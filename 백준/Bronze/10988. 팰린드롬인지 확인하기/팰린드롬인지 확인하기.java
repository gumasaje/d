import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.print(str.equals(sb.reverse().toString())? 1:0);
	}
}