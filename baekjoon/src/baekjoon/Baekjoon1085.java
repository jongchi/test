package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int result = 0;
		
		int x = Integer.parseInt(stk.nextToken());
		int y = Integer.parseInt(stk.nextToken());
		int w = Integer.parseInt(stk.nextToken());
		int h = Integer.parseInt(stk.nextToken());
		
		int n = w - x < x ? w - x : x;							// 가로 길이 계산
		int m = h - y < y ? h - y : y;							// 세로 길이 계산
				
		result = n < m ? n : m; 								// 작은 숫자를 값으로
		
		System.out.println(result);
	}

}
