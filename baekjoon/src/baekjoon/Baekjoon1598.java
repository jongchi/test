package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1598 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		Integer n = Integer.parseInt(stk.nextToken());
		Integer m = Integer.parseInt(stk.nextToken());
		int x1 = n%4 == 0 ? n/4-1 : n/4;							// n이 4의 배수면 1--
		int x2 = m%4 == 0 ? m/4-1 : m/4;
		int x = x1 > x2 ? x1 - x2 : x2 - x1;
		
		int y1 = n%4 == 0 ? 4 : n%4;						// n이 4의 배수면 세로 좌표를 4로 변경 
		int y2 = m%4 == 0 ? 4 : m%4;						
		int y = y1 > y2 ? y1 - y2 : y2 - y1; 
		
		System.out.println(x+y);
		
	}

}
