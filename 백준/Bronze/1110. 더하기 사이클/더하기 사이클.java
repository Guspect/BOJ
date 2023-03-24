import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int temp = -1;
		int n = N;
		int t = 0;
		while(N != temp) {
			if(n < 10) {
				temp = n*10 + n;  
				n = temp;
			}else if(n%10 == 0){
				temp = n/10;
				n = temp;
			}else{
				temp = (n%10)*10 + (((n%10)+(n/10))%10);
				n = temp;
			}
			t++;
		}
		System.out.println(t);
	}
}

