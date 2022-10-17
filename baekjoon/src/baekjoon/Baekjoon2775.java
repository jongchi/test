package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2775 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int people[][] = new int[15][15];									// 각 층 각 호 배열을 만들어줌
		
		for(int i=0;i<15;i++) {												// 0층의 i호는 i
			people[0][i] = i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				int sum = 0;
				for(int m=0;m<=j;m++) {										// i층의 j호는 i-1층의 1~j호의 인원만큼을 더해준다.
					sum += people[i-1][m];
				}
				people[i][j] = sum;
			}
		}
		
		int count = Integer.parseInt(br.readLine());
		while(count>0) {
			count--;
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(people[k][n]+"\n");
		}
		
		System.out.println(sb);
	}	
		
}
