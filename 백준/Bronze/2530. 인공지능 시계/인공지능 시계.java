import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int plus = Integer.parseInt(br.readLine());
		
		int carry = (arr[2]+plus)/60;
		arr[2] = (arr[2]+plus)%60;
		
		if (carry > 0) {
			int temp = arr[1]+carry;
			carry = temp/60;
			arr[1] = temp%60;
		}
		if(carry > 0) {
			arr[0] = (arr[0] + carry) %24;
		}
		
		System.out.println(arr[0] +" "+ arr[1]+ " " +arr[2]);
		
				
	}
}
 
