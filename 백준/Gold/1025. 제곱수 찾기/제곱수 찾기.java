import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		System.out.println(pow(arr,N,M));
		
	}
	public static int pow(int[][] arr, int n, int m) {
		int ans = -1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int im = -n; im < n; im++) {
					for(int jm = -m; jm <m; jm++) {
						if(im == 0 && jm == 0) {
							continue;
						}
						
						int temp = 0;
						int I = i;
						int J = j;
						while(I >= 0 && I < n && J >= 0 && J < m) {
							temp = temp * 10 + arr[I][J];
							if((int)Math.sqrt(temp)*(int)Math.sqrt(temp) == temp) {
								ans = Math.max(ans, temp);
							}
							I += im;
							J += jm;
						}
					}
				}
			}
		}
		
		return ans;
	}

}
