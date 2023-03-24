import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			if(s.equals("0")) {
				break;
			}
			boolean p = true;
			for(int i = 0; i < s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					p = false;
				}
			}
			if(p) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		System.out.println(sb);
	}
	
}
