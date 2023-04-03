import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static class tomato{
		int x;
		int y;
		int day;
		
		public tomato(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	public static Queue<tomato> queue;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m][n];
		queue = new LinkedList<>(); 
		boolean flag = true;
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					queue.add(new tomato(i,j,0));
				}else if (arr[i][j] == 0) {
					flag = false;
				}
			}
		}
		
		if(flag) {
			System.out.println("0");
			return;
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 1) {
					BFS();
				}
			}
		}
		
		int day = 0;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 0) {
					System.out.println("-1");
					return;
				}
				day = day > arr[i][j] ? day : arr[i][j];  
			}
		}
		System.out.println(day);
	}
	
	public static void BFS() {
		while(!queue.isEmpty()) {
			tomato toma = queue.poll();
			int x = toma.x;
			int y = toma.y;
			
			for(int i = 0; i < 4; i++) {
				int newx = x + dx[i];
				int newy = y + dy[i];
				
				if(newx < 0 || newy < 0 || newx >= arr.length || newy >= arr[0].length) {
					continue;
				}
				if(arr[newx][newy] == 0) {
					queue.add(new tomato(newx, newy, toma.day+1));
					arr[newx][newy] = toma.day+1;
				}else if(arr[newx][newy] > 1) {
					if(toma.day+1 < arr[newx][newy]) {
						queue.add(new tomato(newx, newy, toma.day+1));
						arr[newx][newy] = toma.day+1;
					}else {
						continue;
					}
				}
			}
		}
		
	}
	
}
