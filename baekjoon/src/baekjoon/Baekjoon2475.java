package baekjoon;

import java.util.Scanner;

public class Baekjoon2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;							//입력 받은 숫자의 합계
		
		for(int i=0; i<5; i++) {
			int input = sc.nextInt();
			sum+= input * input;
		}
		System.out.println(sum%10);				// 각 수의 제곱을 모두 더 해 10으로 나눈 값을 출력
		sc.close();
	}
}
