package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Point> list = new ArrayList<Point>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk; 
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<count;i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			list.add(new Point(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
		}
		
		Collections.sort(list);
		
		for(Point p : list) {
			System.out.println(p);
		}
	}
}

class Point implements Comparable<Point>{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(x > o.x) {							// x값 먼저 비교
			return 1;
		} else if ( x < o.x) {
			return -1;
		} else {	
			if(y > o.y) {						// x값이 같으면 y값 비교
				return 1;
			} else if(y < o.y) {
				return -1;
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}

