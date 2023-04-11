 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static int[][] tri;
	public static int[][] DP;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		DP = new int [n][n];
		tri = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int temp = 0;
			while(st.hasMoreTokens()) {
				tri[i][temp] = Integer.parseInt(st.nextToken());
				temp++;
			}
		}
		
		DP[0][0] = tri[0][0];
		
		DP(1);
		
		System.out.println(find_max(DP[n-1]));
	}
	
	public static void DP(int n) {
		if(n == DP.length) {
			return;
		}
		for(int i = 0; i <= n; i++) {
			if(i == 0) {
				DP[n][i] = DP[n-1][i] + tri[n][i];
			}else if(i == n) {
				DP[n][i] = DP[n-1][i-1] + tri[n][i];
			}else {
				DP[n][i] = Math.max(DP[n-1][i-1],DP[n-1][i]) + tri[n][i];
			}
		}
		DP(n+1);
		return;
	}
	
	public static int find_max(int[] arr) { 
		int temp = Integer.MIN_VALUE;
		
		for(int i : arr) {
			temp = Math.max(i, temp);
		}
		
		return temp;
	}
}
 
