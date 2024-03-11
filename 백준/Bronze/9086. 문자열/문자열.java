import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String temp = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			sb.append(temp.charAt(0));
			sb.append(temp.charAt(temp.length()-1));
			
			System.out.println(sb);
		}
		
	}
}
 
