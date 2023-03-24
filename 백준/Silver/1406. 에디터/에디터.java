import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Editor{
	Stack<Character> left = new Stack<Character>();
	Stack<Character> right= new Stack<Character>();
	
	public Editor(String s) {
		for(int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
	}
	public void P(char x) {
		left.push(x);
	}
	
	public void L() {
		if(!left.empty()) {
			right.push(left.pop());
		}
	}
	
	public void D() {
		if(!right.empty()) {
			left.push(right.pop());
		}
	}
	
	public void B() {
		if(!left.empty()) {
			left.pop();
		}
	}
	
	public void result(){
		while(!left.empty()) {
			right.push(left.pop());
		}
	}	
	
	
	public void Print_result() {
		StringBuilder sb = new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
}

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Editor e = new Editor(s);
		int n = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < n; i++) {
			String t = br.readLine();
			
			switch(t.charAt(0)) {
			case 'L' :
				e.L();
				break;
			case 'D':
				e.D();
				break;
			case 'B':
				e.B();
				break;
			case 'P':
				e.P(t.charAt(2));
				break;
			}
		}
		
		e.result();
		e.Print_result();
		
	}

}
