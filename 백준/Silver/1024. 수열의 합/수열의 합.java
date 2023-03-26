import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int ans = -2;
		
		while(L <= 100) {
			ans = func(n,L);
			if(ans != -1) {
				break;
			}
			L++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(ans != -1) {
			for(int i = 0; i < L; i++) {
				sb.append(ans).append(" ");
				ans++;
			}
			System.out.println(sb);
		}else {
			System.out.println(ans);
		}
		
	}
	public static int func(int n, int l) {
		int re = -1;
		int t = l*(l-1)/2;
		if((n-t)/l >= 0 && (n-t)%l == 0) {
			re = (n-t)/l;
		}
		return re;
	}
	
}
