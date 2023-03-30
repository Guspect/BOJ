import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	StringTokenizer st = new StringTokenizer (s);
    	int cnt = 0;
    	while(st.hasMoreTokens()) {
    		st.nextToken();
    		cnt++;
    	}
    	System.out.println(cnt);
    }
}