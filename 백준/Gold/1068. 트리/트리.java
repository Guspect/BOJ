import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] parent;
	public static boolean[] visit;
	public static int cnt;
	public static int n;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		
		int root = -1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		parent = new int [n];
		
		for(int i = 0; i < n; i++) {
			parent[i] = Integer.parseInt(st.nextToken());
			if(parent[i] == -1) {
				root = i;
			}
		}
		int delete = Integer.parseInt(br.readLine());
		delete(delete);
		
		cnt = 0;
		visit = new boolean[n];
		count(root);
		System.out.println(cnt);
	}
	public static void delete(int idx) {
		parent[idx] = -2;
		for(int i = 0; i < n; i++) {
			if(parent[i] == idx) {
				delete(i);
			}
		}
	}
	public static void count(int idx) {
		boolean hasChild = false;
		visit[idx] = true;
		if(parent[idx] != -2) {
			for(int i = 0; i < n; i++) {
				if(parent[i] == idx && visit[i] == false) {
					count(i);
					hasChild = true;
				}
			}
			if(!hasChild) {
				cnt++;
			}
		}
	}
	
}

