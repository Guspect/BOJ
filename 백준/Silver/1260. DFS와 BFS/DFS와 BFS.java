import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int[][] graph;
	public static boolean[] visit_DFS;
	public static boolean[] visit_BFS;
	public static StringBuilder sb;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer (br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int root = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][n+1];
		visit_DFS = new boolean[n+1];
		visit_BFS = new boolean[n+1];
		sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		
		DFS(root);
		System.out.println(sb);
		sb.delete(0, sb.length());
		BFS(root);
		System.out.println(sb);
		
	}
	public static void add(int x, int y) {
		graph[x][y] = 1;
		graph[y][x] = 1;
	}
	
	public static void DFS(int now) {
		if(visit_DFS[now] == true) {
			return;
		}
		visit_DFS[now] = true;
		sb.append(now).append(" ");
		
		for(int i = 1; i < graph.length; i++) {
			if(graph[now][i] == 1) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int now) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visit_BFS[now] = true;
		queue.add(now);
		int temp;
		
		while(queue.size() != 0) {
			temp = queue.poll();
			sb.append(temp).append(" ");
			
			for(int i = 1; i < graph.length; i++) {
				if(graph[temp][i] == 1 && !visit_BFS[i]) {
					queue.add(i);
					visit_BFS[i] = true;
				}
			}
		}
	}
		
	
}
