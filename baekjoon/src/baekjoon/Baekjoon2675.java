package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());	// 테스트 케이스의 개수
		
		StringBuffer sb = new StringBuffer();		// 결과값 생성
		for(int i =0; i<T; i++) {
			String[] input = bf.readLine().split(" ");	
			int R = Integer.parseInt(input[0]);		// 반복횟수
			String S = input[1];					// 반복할 문자열
			
			for(int j=0;j<S.length();j++) {	
				char ch = S.charAt(j);				
				for(int k=0;k<R;k++) {				// R만큼 반복
					sb.append(ch);
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
