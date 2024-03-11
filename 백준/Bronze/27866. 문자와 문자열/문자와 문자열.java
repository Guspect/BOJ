import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		char c = s.charAt(i-1);
		System.out.println(c);
		
	}
}
 
