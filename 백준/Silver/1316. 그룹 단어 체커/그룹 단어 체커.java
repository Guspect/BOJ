import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean checker(String s){
		boolean ch[] = new boolean [26];
		int prev = 0;
	
		for(int k = 0; k < s.length(); k++) {
			if(s.charAt(k) != prev) {
				if(ch[s.charAt(k)-'a'] == false) {
					ch[s.charAt(k)-'a'] = true;
					prev = s.charAt(k);
				}else {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	int result = 0;
    	
    	for(int j = 0 ; j < t; j++) {
    		String s = br.readLine();
    		if(checker(s)) {
    			result++;
    		}
    	}
    	System.out.print(result);
    }
}