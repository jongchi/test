package baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();  // 초기 입력값
		int count = 0;			   // 진행 횟수
		int result = value;		   // 목표값 = 초기 입력값
		
		while(true) {
			int x = value / 10, y = value % 10;	// x = 왼쪽 10자리 수. y = 왼쪽 1자리 수
			
			int z = (x + y) % 10;				// z = 오른쪽 1자리 수
			
			value = y * 10 + z;					// 왼쪽 오른쪽의 1자리 수를 조합하여 새로운 값
			
			count++;							
			
			if(value == result) {				// 새로 조합한 수와 목표값이 같으면 종료.
				break;
			}
			
		}
		System.out.println(count);
		
		sc.close();
	}

}
