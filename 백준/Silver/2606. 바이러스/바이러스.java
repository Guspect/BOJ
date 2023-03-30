import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static boolean[] visit;
	public static int cnt = 0;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		arr = new int [n+1][n+1];
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		visit = new boolean[n+1];
		visit[1] = true;
		BFS();
		System.out.println(cnt);
		
	}
	public static void add(int x, int y) {
		arr[x][y] = 1;
		arr[y][x] = 1;
	}
	public static void BFS() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
	
		while(queue.size() != 0) {
			Integer temp = queue.poll();
			
			for(int i = 1; i < arr.length; i++) {
				if(arr[temp][i] == 1 && visit[i] == false) {
					queue.add(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
	}
}

