package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		
		int i = Integer.parseInt(stk.nextToken());
		int j = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());
		int max = 0;
		if(i==j&&j==k) {
			System.out.println(10000+i*1000);
		} else if(i==j&&i!=k) {
			System.out.println(1000+i*100);
		} else if(j==k&&i!=j) {
			 System.out.println(1000+j*100);
		} else if(i==k&&i!=j) {
			System.out.println(1000+i*100);
		} else if(i!=k&&i!=k) {
			if(i > max) {
				max = i;
			}
			if(j > max) {
				max = j;
			}
			if(k > max) {
				max = k;
			}
			System.out.println(max*100);
		}
		
	}

}
