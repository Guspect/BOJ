import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int n = 0;
			if(y-x == 1) {
				System.out.println("1");
			}
			while((y-x)-(n*(n+1)) > n+1) {
				n++;
				if((y-x)-(n*(n+1)) == 0) {
					System.out.println(2*n);
					break;
				}
				else if((y-x)-(n*(n+1)) == n+1 || (y-x)-(n*(n+1)) < n+1){
					System.out.println((2*n)+1);
					break;
				}
				if((y-x)-((n+1)*(n+2)) < 0) {
					System.out.println((2*n)+2);
					break;
				}
			}
		}
	}	
}