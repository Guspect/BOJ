import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main { 
	public static ArrayList<Integer> list[];
	public static boolean[] isVisit;
	public static int[] parent;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N+1];
		
		for(int i = 0; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			Integer t1 = Integer.parseInt(st.nextToken());
			Integer t2 = Integer.parseInt(st.nextToken());
			
			list[t1].add(t2);
			list[t2].add(t1);
		}
		
		isVisit = new boolean[N+1];
		parent = new int[N+1];
		
		dfs(1);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i < N+1; i++) {
			sb.append(parent[i]);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int idx) {
		isVisit[idx] = true;
		for(int i : list[idx]) {
			if(!isVisit[i]) {
				parent[i] = idx;
				dfs(i);
			}
		}
	}
}
 
