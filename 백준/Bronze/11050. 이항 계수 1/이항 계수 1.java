 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		if(k > n || k < 0) {
			System.out.println("0");
		}else {
			System.out.println(facto(n)/(facto(k)*facto(n-k)));
		}
		
	}
	public static long facto(int n) {
		long temp = 1;
		
		for(int i = 1; i <= n; i++) {
			temp *= (long)i;
		
		}
		return temp;
	}
	
}
 
