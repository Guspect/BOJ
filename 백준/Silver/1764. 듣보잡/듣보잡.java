 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String,Boolean>Map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			Map.put(br.readLine(), false);
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(int j = 0; j < m; j++) {
			String t = br.readLine();
			if(Map.containsKey(t)) {
				list.add(t);
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		while(!list.isEmpty()) {
			String s = list.remove(0);
			sb.append(s).append("\n");
		}
		System.out.println(sb);		
	}
}
 
