import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] graph;
	public static boolean[] visit;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new int [n+1][n+1];
		visit = new boolean [n+1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(visit[i] == false) {
				DFS(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void add(int a, int b) {
		graph[a][b] = 1;
		graph[b][a] = 1;
	}
	public static void DFS(int now) {
		if(visit[now] == true) {
			return;
		}
		visit[now] = true;
		for(int i = 1; i < graph.length; i++) {
			if(graph[now][i] == 1) {
				DFS(i);
			}
		}
	}
	
}
		
