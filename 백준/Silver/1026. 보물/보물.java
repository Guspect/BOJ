import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int [n];
		int[] b = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j = 0; j < n; j++) {
			a[j] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int j = 0; j < n; j++) {
			b[j] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		Integer[] B = Arrays.stream(b).boxed().toArray(Integer[]::new); 
		Arrays.sort(B, Collections.reverseOrder());
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i]*B[i];
		}
		System.out.println(sum);
	}
}
 
