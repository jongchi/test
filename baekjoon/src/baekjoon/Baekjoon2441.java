package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=n;i>0;i--) {
			int x = n-i;
			for(int j=0;j<x;j++) {
				sb.append(" ");
			}
			for(int k=i;k>0;k--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
