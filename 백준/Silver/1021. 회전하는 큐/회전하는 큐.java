import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> deque = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}
		
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			int target = deque.indexOf(Integer.parseInt(st.nextToken()));
			int half;
			
			if(deque.size() % 2 == 0) {
				half = deque.size() / 2 - 1;
			}else {
				half = deque.size() / 2 ;
			}
			
			if(target <= half) {
				for(int j = 0; j < target; j++) {
					deque.addLast(deque.pollFirst());
					cnt++;
				}
			}else {
				for(int j = 0; j < deque.size() - target; j++) {
					deque.addFirst(deque.pollLast());
					cnt++;
				}
			}
			deque.pollFirst();
			
		}
		
		System.out.println(cnt);
		
	}
}

