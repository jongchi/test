package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
			int count = Integer.parseInt(bf.readLine());		// 계산 횟수 
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i<count; i++) {
				String[] input = bf.readLine().split(" ");		// 공백 문자로 앞 뒤 숫자 자르기
				int x = Integer.parseInt(input[0]);				// 첫 번째 입력 숫자
				int y = Integer.parseInt(input[1]);				// 두 번째 입력 숫자
				
				sb.append((x+y)+"\n");
				
			}
		
		System.out.println(sb.toString());

	}

}
