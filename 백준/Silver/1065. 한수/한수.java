import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	System.out.println(d(n));
    }
        

    public static int d (int number){
        int result = 0;
        int a,b = 0;

        if(number >= 100) {
        	result = 99;
        	for(int i = 100; i <= number; i++) {
        		a = i/100;
            	b = i/10 - (a*10);
            	if(a-b == b-(i%10)) {
            		result++;
            	}
        	}
        }else {
        	result = number;
        }

        return result;
    }
}