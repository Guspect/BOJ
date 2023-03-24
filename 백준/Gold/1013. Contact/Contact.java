import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		
		String vega = "(100+1+|01)+";
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if(s.matches(vega)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
}

