package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1371 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			String input = bf.readLine();
			sb.append(i+1+". "+input+"\n");
		}
		
		System.out.println(sb);
	}

}
