package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			
			String input = bf.readLine();
			if(input.equals("0")) {				// 0을 입력 받으면 종료
				break;
			}
			int length = input.length() -1;		// 배열 마지막부터 숫자 비교 위해 1 미리 빼줌
			int half = input.length()/2;		// 비교를 위해서 길이를 반으로 자름
			boolean palindrome = true;
			
			for(int i = 0; i<half; i++) {
				char ch1 = input.charAt(i);
				char ch2 = input.charAt(length - i);
				
				if(ch1 != ch2) {				
					palindrome = false;
				}
			}
			
			if(palindrome) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
			
		}
		System.out.println(sb);
	}

}
