 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			Integer[] priority = new Integer[n];
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				priority[j] = Integer.parseInt(st.nextToken());
			}
			System.out.println(print(priority,n,m));
		}
		
		
	}
	public static int print(Integer[] arr, int n, int m) {
		Queue<Page> queue = new LinkedList<>();

		for(int i = 0; i < n; i++) {
			Page p;
			if(i == m) {
				p = new Page(arr[i],true);
			}else {
				p = new Page(arr[i],false);
			}
			queue.add(p);
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		int cnt = 0;
		
		while(!queue.isEmpty()) {
			Page temp = queue.poll();
			if(temp.priority == arr[cnt]) {
				cnt++;
				if(temp.target) {
					return cnt;
				}
			}else {
				queue.add(temp);
			}
		}
		
		return cnt;
	}
	public static class Page{
		int priority;
		boolean target;
		
		public Page(int p, boolean t) {
			priority = p;
			target = t;
		}
	}

}
 
