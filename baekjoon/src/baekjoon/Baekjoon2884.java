package baekjoon;

import java.util.Scanner;

public class Baekjoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();					// 입력 받은 시간
		int M = sc.nextInt();					// 입력 받은 분
		
		if(M<45) {
			M = M+60-45;						// 45분 이전
			if(H>0) {
				H --;							// 0시보다 큰 시간이면 -1
			} else {
				H = 23;							// 0시면 23시로 변경
			}
		} else {
			M -= 45;
		}
		System.out.println(H+" "+M);
		sc.close();
	
	}

}
