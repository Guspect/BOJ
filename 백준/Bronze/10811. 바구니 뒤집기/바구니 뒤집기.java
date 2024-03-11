import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start_idx = Integer.parseInt(st.nextToken());
			int end_idx = Integer.parseInt(st.nextToken());
			start_idx--;
			end_idx--;
			
			while(start_idx <= end_idx) {
				int temp = arr[start_idx];
				arr[start_idx] = arr[end_idx];
				arr[end_idx] = temp;
				start_idx++;
				end_idx--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb);
		
	}
}
 
