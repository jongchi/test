package baekjoon;

import java.util.Scanner;

public class Baekjoon1001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		String[] input = scan.nextLine().split(" ");	// 입력값을 " "로 나누어서 저장
		
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		System.out.println(x-y);					// 1000번 문제에서 +만 -로 변경
		scan.close();

	}

}
