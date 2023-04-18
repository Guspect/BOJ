 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static int white;
	public static int blue;
	public static int[][] arr;
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		boolean flag = true;
		int prev = -1;
		int now = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				now = Integer.parseInt(st.nextToken());
				arr[i][j] = now;
				if(flag) {
					if(prev != -1) {
						if(prev != now) {
							flag = false;
						}
					}
					prev = now;
				}
			}
		}
		
		if(!flag) {
			cut(0,0,n);
		
			System.out.println(white);
			System.out.println(blue);
		}
		else {
			if(now == 1) {
				System.out.println(0);
				System.out.println(1);
			}else {
				System.out.println(1);
				System.out.println(0);
			}
		}
 	}
	public static void cut(int x ,int y,int size) {
		if(size == 1) {
			return;
		}	
		
		if(!find(x,y,size)) {
			cut(x,y,size/2);
		}
		if(!find(x+size/2,y,size)) {
			cut(x+size/2,y,size/2);
		}
		if(!find(x,y+size/2,size)) {
			cut(x,y+size/2,size/2);
		}
		if(!find(x+size/2,y+size/2,size)) {
			cut(x+size/2,y+size/2,size/2);
		}
		
	}
	public static boolean find(int start_x, int start_y, int size) {
		int w = 0;
		int b = 0;

		for(int i = start_x; i < start_x+size/2; i++) {
			for(int j = start_y; j < start_y+size/2; j++) {
				if(arr[i][j] == 0) {
					w++;
				}else {
					b++;
				}
			}
		}
		
		if(w > 0 && b > 0) {
			return false;
		}else {
			if(w > 0) {
				white++;
			}else {
				blue++;
			}
			return true;
		}
		
	}
}
 
