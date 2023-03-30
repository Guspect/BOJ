import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i= 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			max = max < temp ? temp : max;
			min = min > temp ? temp : min;
			
		}
		System.out.println(min + " " + max);
	}
	
	
}
		
