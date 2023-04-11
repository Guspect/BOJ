 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			boolean flag = false;
			if(s.length() == 1) {
				break;
			}
			Stack<Character> stack1 = new Stack<>();
			Stack<Character> stack = new Stack<>();
			for(char c : s.toCharArray()) {
				if(c == '[' || c == '(') {
					stack.add(c);
				}else if(c == ']' || c == ')'){
					try {
						char temp = stack.pop();
						if(c == temp+1 ||c == temp+2 ) {}
						else {
							System.out.println("no");
							flag = true;
							break;
						}
					}catch(EmptyStackException e) {
						System.out.println("no");
						flag = true;
						break;
					}
				}
			}
			if(!flag) {
				if(stack.isEmpty()) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
		
	}

}
 
