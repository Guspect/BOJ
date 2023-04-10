 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static int[][] house;
	public static int[][] DP;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		house = new int [n][3];
		DP = new int [n][3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		DP[0][0] = Integer.parseInt(st.nextToken());
		DP[0][1] = Integer.parseInt(st.nextToken());
		DP[0][2] = Integer.parseInt(st.nextToken());
		
		house[0][0] = DP[0][0];
		house[0][0] = DP[0][1];
		house[0][0] = DP[0][2];
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			house[i][0] = Integer.parseInt(st.nextToken());
			house[i][1] = Integer.parseInt(st.nextToken());
			house[i][2] = Integer.parseInt(st.nextToken());
			
		}
		paint(1,0);
		
		
		System.out.println(Math.min(Math.min(DP[n-1][0], DP[n-1][1]),DP[n-1][2]));
	}
	public static void paint(int n, int color) {
		if(DP[n][color] == 0) {
			if(color == 0) {
				DP[n][color] = Math.min(DP[n-1][1],DP[n-1][2]) + house[n][color];
			}else if(color == 1) {
				DP[n][color] = Math.min(DP[n-1][0],DP[n-1][2]) + house[n][color];
			}else {
				DP[n][color] = Math.min(DP[n-1][0],DP[n-1][1]) + house[n][color];
			}
			if(color < 2) {
				paint(n,color+1);
			}else if(color == 2 && n < DP.length-1){
				paint(n+1,0);
			}
		}
		return;
	}
}
 
