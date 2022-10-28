package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(stk.nextToken());
		int y = Integer.parseInt(stk.nextToken());
		
		int r = euclidean(Math.max(x, y), Math.min(x, y));
		
		bw.write(r+"\n");
		x /= r;
		y /= r;
		
		bw.write(Integer.toString(x*y*r));
		
		bw.flush();
		
	}
	
	
	static int euclidean(int x, int y) {
		int r;
		r = x % y;
		if(r == 0) {
			return y;
		} else {
			return euclidean(y, r);
		}
	}
}
