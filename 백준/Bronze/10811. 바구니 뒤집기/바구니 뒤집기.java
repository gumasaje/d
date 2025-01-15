import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			while(I<J) {
				
				for(int j=I; j<=J; j++) {
					int K = arr[I-1];
					arr[I-1] = arr[J-1];
					arr[J-1] = K;
					I++;
					J--;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}