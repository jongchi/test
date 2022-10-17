package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int count = 0;
		
		while(n%5 > 0) {			// 5로 나뉘어지는 수가 아니면 3개씩 봉지에 담음
			n -= 3;
			count++;
		}
		if(n%5 == 0) {				// 5로 나누어지면 봉지 개수를 몫만큼 더해줌
			count += n/5;
		} else {
			count = -1;				// 5 or 3으로 나누어지지않는 수만큼 남으면 -1 반환
		}
		
		System.out.println(count);
		
	}

}
