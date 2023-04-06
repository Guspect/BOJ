import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node head = new Node('A',null,null);
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char parent = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			add(head,parent,left,right);
		}
		firstOrder(head);
		System.out.println();
		inOrder(head);
		System.out.println();
		postOrder(head);
	}
	public static void add(Node root, char p, char l, char r) {
		if(root.data == p) {
			root.left = l == '.' ? null : new Node(l,null,null);
			root.right = r == '.' ? null : new Node(r,null,null);
		}else {
			if(root.left != null) {
				add(root.left, p, l, r);
			}
			if(root.right != null) {
				add(root.right, p, l, r);
			}
		}
	}
	public static void firstOrder(Node temp) {
		if(temp == null) {
			return;
		}
		System.out.print(temp.data);
		firstOrder(temp.left);
		firstOrder(temp.right);
	}
	public static void inOrder(Node temp) {
		if(temp == null) {
			return;
		}
		inOrder(temp.left);
		System.out.print(temp.data);
		inOrder(temp.right);
	}
	public static void postOrder(Node temp) {
		if(temp == null) {
			return;
		}
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.print(temp.data);
	}
}
class Node{
	char data;
	Node right;
	Node left;
	
	public Node(char c, Node l, Node r) {
		this.data = c;
		this.right = r;
		this.left = l;
	}
} 
