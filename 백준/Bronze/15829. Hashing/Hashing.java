 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		System.out.println(hash(n,s));
	}
	public static long hash(int n, String s) {
		long temp = 0;
		for(int i = 0; i < n; i++) {
			temp += (Math.pow(31, i)%1234567891 * (s.charAt(i)-'a'+1)%1234567891)%1234567891;
		}
		return temp%1234567891;
	}
	
}


 
