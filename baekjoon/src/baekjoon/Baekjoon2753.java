package baekjoon;

import java.util.Scanner;

public class Baekjoon2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();					// 입력한 연도
		
		if(input%4 == 0 && input%100 != 0) {
			System.out.println(1);					// 1 - 윤년 / 0 - 윤년 X
		} else if (input%400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
		
	}

}
