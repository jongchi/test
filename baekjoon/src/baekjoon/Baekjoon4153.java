package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tmp = 0;
		while(true) {
			StringTokenizer stk = new StringTokenizer(bf.readLine()," ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			
			if(a < 1 || b < 1 || c < 1) {					// 길이 0을 입력 받으면 즉시 종료
				return;
			}
			
			if(a>c) {										// 가장 긴 변의 길이를 C로 하기 위해 길이 비교
				tmp = a;
				a = c;
				c = tmp;
			}
			
			if(b>c) { 										// 가장 긴 변의 길이를 C로 하기 위해 길이 비교
				tmp = b;
				b = c;
				c = tmp;
			}
			
			if((a*a)+(b*b) == (c*c)) {						// 직각이면 right~
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
 
	}

}
