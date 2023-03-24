import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static boolean chess[][];
	public static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		chess = new boolean [N][M];
		
		for(int i = 0 ; i < N; i++) {
			String s = br.readLine();
			for(int j =0; j < M; j++) {
				if(s.charAt(j)=='B') {
					chess[i][j] = true;
				}else {
					chess[i][j] = false;
				}
			}
		}
		
		for(int i = 0; i < N-7; i++) {
			for(int j = 0; j < M-7; j++) {
				mini(i,j);
			}
		}
		System.out.print(min);
	}
	public static void mini(int n, int m) {
		int count = 0;
		boolean first = chess[n][m];
		
		for(int i = n; i < n+8; i++) {
			for(int j = m; j < m+8; j++) {
				if(first != chess[i][j]) {
					count ++;
				}
				first = (!first);
			}
			first = !first;
		}
		count = Math.min(64-count, count);
		min = Math.min(min,count);
	}
}