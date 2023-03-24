import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int a[] = new int [26];
    	String s = br.readLine();
    	
    	for(int i = 0; i < 26; i++) {
    		a[i] = 0;
    	}
    	for(int j = 0; j < s.length(); j++) {
    		if(Character.isUpperCase(s.charAt(j))) {
    			a[s.charAt(j)-'A']++;
    		}else {
    			a[s.charAt(j)-'a']++;
    		}
    	}
    	int max = 0;
    	int max_ind = 0;
    	max = a[0];
    	for(int k = 1; k <= 25; k++) {
    		if(max < a[k]) {
    			max = a[k];
    			max_ind = k;
    		}else if(max == a[k]) {
    			max_ind = -1;
    		}
    	}
    	if(max_ind == -1) {
    		bw.write("?");
    	}else {
    		bw.write(Character.toChars(max_ind+65));
    	}
    	bw.close();
    }
}