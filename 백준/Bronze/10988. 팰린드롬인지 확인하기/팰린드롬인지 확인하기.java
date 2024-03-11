import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length(); i > 0; i--) {
			sb.append(s.charAt(i-1));
		}
		String temp = sb.toString();
		
		if(s.compareTo(temp) == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}
}
 
