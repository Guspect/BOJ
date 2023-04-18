 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static StringBuilder sb;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		
		Set set = new Set();
		sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			int para = 0;
			if(st.hasMoreTokens()) {
				para = Integer.parseInt(st.nextToken());
			}
			
			if(op.equals("add")) {
				set.add(para);
			}else if(op.equals("remove")) {
				set.remove(para);
			}else if(op.equals("check")) {
				set.check(para);
			}else if(op.equals("toggle")) {
				set.toggle(para);
			}else if(op.equals("all")) {
				set.all();
			}else {
				set.empty();
			}
		}
		
		System.out.println(sb);
		
		
	}
	static class Set{
		public boolean[] arr;
		
		public Set() {
			arr = new boolean[20];
		}
		
		public void add(int x) {
			if(!arr[x-1]) {
				arr[x-1] = true;
			}
			return;
		}
		
		public void remove(int x) {
			if(arr[x-1]) {
				arr[x-1] = false;
			}
			return;
		}
		
		public void check(int x) {
			if(arr[x-1]) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
			return;
		}
		
		public void toggle(int x) {
			if(arr[x-1]) {
				arr[x-1] = false;
			}else {
				arr[x-1] = true;
			}
			return;
		}
		
		public void all() {
			for(int i = 0; i < 20; i++) {
				arr[i] = true;
			}
		}
		
		public void empty() {
			arr = new boolean[20];
		}
	}
	
}
 
