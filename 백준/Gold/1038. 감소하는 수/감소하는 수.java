import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static ArrayList<Long> list;
	
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		
		if(n <= 10) {
			System.out.println(n);
		}else if(n > 1022) {
			System.out.println("-1");
		}else {
			for(int i = 0; i < 10; i++) {
				make_num(i, 1);
			}
			Collections.sort(list);
			System.out.println(list.get(n));
		}
		
	}
	public static void make_num(long num, int len) {
		if(len > 10) {
			return;
		}
		
		list.add(num);
		for(int i = 0; i < num%10; i++) {
			make_num((num*10) + i, len+1);
		}
	}
	
}
