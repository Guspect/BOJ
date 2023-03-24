import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int count[] = new int [10];
		
		for(int i =0 ; i < s.length(); i++ ) {
			count[s.charAt(i)-'0']++;
		}
		
		for(int i = 9; i >= 0; i--) {
			while(count[i]-- >0) {
				System.out.print(i);
			}
		}
	}
}




