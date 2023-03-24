import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		int k = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!queue.isEmpty()) {
			for(int i = 0; i < k-1; i++) {
				queue.add(queue.poll());
			}
			if(queue.size() != 1) {
				sb.append(queue.peek());
				sb.append(", ");
			}else {
				sb.append(queue.peek());
			}
			queue.remove();
		}
		sb.append(">");
		System.out.println(sb);

	}

}
