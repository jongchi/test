package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;
		List<PointY> list = new ArrayList<PointY>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(br.readLine()," ");
			list.add(new PointY(stk.nextToken(), stk.nextToken()));
		}
		
		Collections.sort(list);
		
		for(PointY point : list) {
			bw.write(point.toString());
		}
		
		bw.flush();
	}

}

class PointY implements Comparable<PointY>{
	int x;
	int y;
	
	public PointY(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	
	@Override
	public int compareTo(PointY o) {
		if(this.y > o.y) {
			return 1;
		} else if (this.y == o.y){
			if(this.x >o.x) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	
	@Override 
	public String toString() {
		return x+" "+y+"\n"; 
	}
}
