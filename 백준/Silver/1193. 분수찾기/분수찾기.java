import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int t = 0; 
		int sum = 0; 
		int n = 0;
		while(true) {
			if(sum < a && a <= sum+t+1){
				if(t%2 == 0) {
					n = a-sum;
					System.out.print(t+1-(n-1) + "/" + n );
					System.exit(0);
				}else {
					n =sum+t+2-a;
					System.out.print(t+1-(n-1) + "/" + n );
					System.exit(0);
				}
			}else {
				t++;
				sum = 0;
				for(int i = 1; i <= t; i++) {
					sum += i;
				}
			}
		}
    }
}