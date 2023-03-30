import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static int cnt = 0;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int [n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			String s = br.readLine();
			for(int j = 1; j <= n; j++) {
				arr[i][j] = s.charAt(j-1) -'0';
			}
		}
		visit = new boolean[n+1][n+1];
		ArrayList<Integer> num_house = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(arr[i][j] == 1 && visit[i][j] == false) {
					cnt = 0;
					DFS(i,j);
					num_house.add(cnt);
				}
			}
		}
		Collections.sort(num_house);
		System.out.println(num_house.size());
		for(int i : num_house) {
			System.out.println(i);
		}
	}
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		cnt++;
		
		for(int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			
			if(newx <= 0 || newy <= 0 || newx >= arr.length || newy >= arr.length) {
				continue;
			}
			if(visit[newx][newy] == false && arr[newx][newy] == 1) {
				DFS(newx, newy);
			}
		}
	}
}
