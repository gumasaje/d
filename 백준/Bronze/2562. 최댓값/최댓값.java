import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int max = 0;
		int n = 0;
		
		for(int i=0; i<arr.length;i++) {
            
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > max) {
				max = arr[i];
				n = i+1;
			}
		}
		System.out.println(max);
		System.out.print(n);
	}
}