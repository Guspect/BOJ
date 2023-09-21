import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
	private static class Point{
	    private final long x,y;
	        
	    Point(long x, long y){
	        this.x = x;
	        this.y = y;
	    }
	    public long get_x(){
	        return this.x;
	    }
	    public long get_y(){
	        return this.y;
	    }
	}
	    
	public Point find_intersection(long A, long B, long E, long C, long D, long F){
	    double x = (double)(B*F-E*D)/(A*D-B*C);
	    double y = (double)(E*C-A*F)/(A*D-B*C);
	        
	    if(x % 1 != 0 || y % 1 != 0){
	        return null;
	    }
	    return new Point((long)x,(long)y);
	}
	    
	    public char[][] make_arr (List<Point> l){
	        long max_x = Long.MIN_VALUE;
	        long max_y = Long.MIN_VALUE;
	        long min_x = Long.MAX_VALUE;
	        long min_y = Long.MAX_VALUE;
	        
	        for(Point p : l){
	            long temp_x = p.get_x();
	            long temp_y = p.get_y();
	            
	            if(temp_x > max_x){
	                max_x = temp_x;
	            }
	            if(temp_x < min_x){
	                min_x = temp_x;
	            }
	            if(temp_y > max_y){
	                max_y = temp_y;
	            }
	            if(temp_y < min_y){
	                min_y = temp_y;
	            }
	        }
	        long len_x = max_x - min_x + 1;
	        long len_y = max_y - min_y + 1;
	        
	        char[][] arr = new char[(int)len_y][(int)len_x];
	        for(int i = 0; i < len_y; i++){
	            Arrays.fill(arr[i],'.');
	        }
	        
	        for(Point p : l){
	            long temp_x = p.get_x() - min_x;
	            long temp_y = (p.get_y() - max_y)*(-1);
	            arr[(int) temp_y][(int) temp_x] = '*';
	        }
	        return arr;
	    }
        
        public static String[] add(String[] origin, String s) {
	    	String[] newArr = new String[origin.length+1];
	    	
	    	for(int i = 0; i < origin.length; i++) {
	    		newArr[i] = origin[i];
	    	}
	    	
	    	newArr[origin.length] = s;
	    	return newArr;
	    	
	    }
	    
	    public String[] solution(int[][] line) {
	        List<Point> inter = new ArrayList<>();
	        String[] answer = {};
	        
	        for(int i = 0; i < line.length; i++){
	            for(int j = i+1; j < line.length; j++){
	                Point point = find_intersection(line[i][0],line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);
	                if(point != null){
	                    inter.add(point);
	                }
	                
	            }
	        }
	        char[][] arr = make_arr(inter);
	        
	        String s = "";
	        for(int i = 0; i < arr.length; i++){
	            s = s = new String(arr[i]);
                
	            answer = add(answer, s);
	        }
	        
	        return answer;
	    }
	
}
 
