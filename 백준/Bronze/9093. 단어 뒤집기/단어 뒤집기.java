import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		char[] stack = new char [20];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				for(int j = 0; j < s.length(); j++) {
					stack[j] = s.charAt(j);
				}
				for(int k = s.length(); k > 0; k--) {
					bw.write(stack[k-1]);
				}
				bw.write(" ");
			}
			bw.write('\n');
		}
		bw.flush();
	}

}
