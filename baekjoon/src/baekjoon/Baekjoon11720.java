package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());		// 시행 횟수 
		int result = 0;									// 결과값
		
		if(N > 0) {										//N이 0이면 바로 0 출력
			String[] input = bf.readLine().split("");
			
			for(String str : input) {
				result += Integer.parseInt(str);
			}
		}
		
		System.out.println(result);
	}

}
