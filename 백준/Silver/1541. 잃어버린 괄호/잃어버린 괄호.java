import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		
		int cnt = 1;
		int ans = 0;
		while(st.hasMoreTokens()) {
			if(cnt == 1) {
				ans += calc(st.nextToken());
			}else {
				ans -= calc(st.nextToken());
			}
			cnt++;
		}
		System.out.println(ans);
	}
	public static int calc(String s) {
		int temp = 0;
		StringTokenizer st2 = new StringTokenizer(s,"+");
		
		while(st2.hasMoreTokens()) {
			temp += Integer.parseInt(st2.nextToken());
		}
		return temp;
	}
		
}
