import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = n-1;
		int[][] ans = new int [1][2];
		int min = Integer.MAX_VALUE;
		
		while(i < j) {
			int sum = arr[i] + arr[j];
			int temp = Math.abs(sum);
			if(min > temp) {
				min = temp;
				ans[0][0] = arr[i];
				ans[0][1] = arr[j];
			}
			
			if(sum > 0) {
				j--;
			}else {
				i++;
			}
		}
		
		System.out.println(ans[0][0] + " " + ans[0][1]);
 	}
}
 
