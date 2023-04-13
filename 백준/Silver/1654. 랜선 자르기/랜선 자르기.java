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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
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
				cnt += arr[i]/mid;
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
 
