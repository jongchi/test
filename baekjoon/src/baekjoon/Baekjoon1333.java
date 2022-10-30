package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1333 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(stk.nextToken());				// 곡의 수량
		int l = Integer.parseInt(stk.nextToken());				// 곡의 길이
		int d = Integer.parseInt(stk.nextToken());				// 벨소리 텀
		
		int[] calls = new int[n];
		int call = 0;
		for(int i=0;i<n;i++) {
			call += l;
			calls[i] = call;
			call +=5;
		}
		
		call = 0;
		for(int i=0;i<n;i++) {
			call +=d;
			if(call>calls[i] && call<calls[i]+5) {
				System.out.println(call);
				return;
			}
			call++;
		}
		
		System.out.println(calls[n-1]);
		
	}

}
