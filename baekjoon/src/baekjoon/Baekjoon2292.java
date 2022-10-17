package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2292 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()) - 1;			// 계산 용이하게 하기 위해 1 빼주고 시작
		int count = 1;
		
		while(n > 0) {				
			n -= 6*count;									// 칸 당 6의 배수만큼 늘어남.
			count++;			
		}
				
		System.out.println(count);
	}

}
