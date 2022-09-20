package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(bf.readLine()); 
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++){
			stk = new StringTokenizer(bf.readLine(), " ");
			int H = Integer.valueOf(stk.nextToken());			// 층 수
			int W = Integer.valueOf(stk.nextToken()); 			// 호 수
			int N = Integer.valueOf(stk.nextToken());			// N 번째로 온 손님
			
			if(N%H!=0) {
				sb.append(N%H);
			} else {
				sb.append(H);
			}
			
			int x = N/H+1;									// 배정할 호수 : 호수는 1부터 시작
			
			if(x < 9) {										// 호수가 10보다 작으면 중간에 0 더해줌 
				sb.append("0"+x);
			} else {
				sb.append(x);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
