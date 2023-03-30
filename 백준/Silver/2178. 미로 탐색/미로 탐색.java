import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int [n+1][m+1];
		
		for(int i = 1; i <= n; i++) {
			String s = br.readLine();
			for(int j = 1; j <= m; j++) {
				arr[i][j] = s.charAt(j-1) -'0';
			}
		}
		visit = new boolean[n+1][m+1];
		
		visit[1][1] = true;
		BFS();
		System.out.println(arr[n][m]);
		
	}
	public static void BFS() {
		Queue<Integer[]> queue = new LinkedList<>();
		queue.add(new Integer[] {1,1});
	
		while(queue.size() != 0) {
			Integer[] temp = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int newx = temp[0] + dx[i];
				int newy = temp[1] + dy[i];
				
				if(newx <= 0 || newy <= 0 || newy >= arr[0].length || newx >= arr.length) {
					continue;
				}
				if(arr[newx][newy] >= 1 && visit[newx][newy] == false) {
					queue.add(new Integer[] {newx, newy});
					arr[newx][newy] = arr[temp[0]][temp[1]] + 1;
					visit[newx][newy] = true;
				}
			}
			
		}
	}
}
