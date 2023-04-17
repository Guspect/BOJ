 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] arr = new String[n+1];
		for(int i = 1; i <= n; i++) {
			String temp = br.readLine();
			map.put(temp, i);
			arr[i] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String temp = br.readLine();
			try{
				int num = Integer.parseInt(temp);
				sb.append(arr[num]).append("\n");
			}catch(NumberFormatException e) {
				sb.append(map.get(temp)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}
 
