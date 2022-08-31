package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(bf.readLine());	// OX 횟수~
		int[] result = new int[count];					// 결과값
		int sum = 0; 									// 점수 더하기 쓸 때 사용할 값
		
		StringBuilder sb = new StringBuilder();			// 결과값 생성
		
		for(int i=0;i<count;i++) {
			String input = bf.readLine();
			sum = 0;
			for(int j=0;j<input.length();j++) {
				char ch = input.charAt(j);
				if(ch == 'O') {
					sum++;
					result[i] +=sum;
				} else {
					sum = 0;
				}
			}
			sb.append(result[i]+"\n");
		}
		
		System.out.println(sb.toString());

	}

}
