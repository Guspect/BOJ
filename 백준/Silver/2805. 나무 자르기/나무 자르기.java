 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		long max = 0;
		
		st = new StringTokenizer (br.readLine());
		for(int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(max < temp) {
				max = temp;
			}
			arr[i] = temp;
		}
		
		max++;
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			mid = (max+min)/2;
			
			long cnt = 0;
			
			for(int i = 0; i < n; i++) {
				long len = arr[i]-mid; 
				if(len > 0) {
					cnt += len;
				}
			}
			
			if(cnt < m) {
				max = mid;
			}else {
				min = mid + 1;
			}
			
		}
		
		System.out.println(min-1);
			
	}
	
}
 
