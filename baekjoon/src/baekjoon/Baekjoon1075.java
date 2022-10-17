package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1075 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int result = 0;
		
		n = n/100*100;									// 가장 뒤 두자리를 00으로 리셋.
		
		for(int i=0;i<100;i++) {
			if(n%f ==0) {
				result = i;								// n이 f로 나눠지면 종료
				break;
			} else {
				n++;								
			}
		}
		
		if(result < 10) {
			System.out.println("0"+result);				// 10 미만일경우 앞에 0을 더해서 출력
		} else {
			System.out.println(result);
		}
	}
}
