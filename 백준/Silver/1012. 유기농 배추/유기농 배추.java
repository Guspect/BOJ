import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static int cnt = 0;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int l = 0; l < t; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			cnt = 0;
			arr = new int [n][m];
		
			for(int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			
			visit = new boolean[n][m];
		
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(arr[i][j] == 1 && visit[i][j] == false) {
						DFS(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
		}
	}
	
	public static void add(int x, int y) {
		arr[x][y] = 1;
	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			
			if(newx < 0 || newy < 0 || newx >= arr.length || newy >= arr[0].length) {
				continue;
			}
			if(visit[newx][newy] == false && arr[newx][newy] == 1) {
				DFS(newx, newy);
			}
		}
	}
}
