import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] arr = new int [41][2];

	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int k = 2; k < 41; k++) {
			for(int j = 0; j < 2; j++) {
				arr[k][j] = -1;
			}
		}
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		for(int i = 0; i < t; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input > 1) {
				fibo(input);
			}
			System.out.println(arr[input][0] + " " + arr[input][1]);
		}
	}
	
	public static int[] fibo(int n) {
		if(arr[n][0] == -1 || arr[n][1] == -1) {
			arr[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
			arr[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
		}
		return arr[n];
	}

}
