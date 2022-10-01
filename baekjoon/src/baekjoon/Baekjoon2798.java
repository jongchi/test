package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(stk.nextToken());				// 카드의 개수		
		int m = Integer.valueOf(stk.nextToken());				// 목표 값
		int max = 0;
		
		stk = new StringTokenizer(br.readLine(), " ");
		int[] list = new int[n];
		for(int i=0; i< n; i++) {
			list[i] = Integer.valueOf(stk.nextToken());
		}
		
		for(int i=0;i<n-2;i++) {
			int x = list[i];
			for(int j = i+1;j<n-1;j++) {
				int y = list[j];
				for(int k = j+1;k<n;k++) {
					int z = list[k];
					
					if(x+y+z > max && x+y+z <= m) {
						max = x+y+z;
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
