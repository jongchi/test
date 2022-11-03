package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		int minCnt = 64;
		
		boolean[][] space = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			
			String colors = br.readLine();
			
			for(int j=0;j<m;j++) {
				char color = colors.charAt(j);;
				if(color == 'W'){
					space[i][j] = true;
				} else {
					space[i][j] = false;
				}
			}
			
		}
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				int cnt = countColor(space, i, j);
				
				if(cnt<minCnt) {
					minCnt = cnt;
				}
			}
		}
		
		System.out.println(minCnt);
		
	}
	
	
	public static int countColor(boolean[][] space, int x, int y) {
		int cnt = 0;
		
		boolean color = space[x][y];
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(space[i][j] != color) {
					cnt++;
				} 
				color = !color;
			}
			color = !color;
		}
		
		return cnt < 64-cnt ? cnt : 64-cnt; 
	}
}
