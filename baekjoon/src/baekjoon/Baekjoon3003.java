package baekjoon;

import java.util.Scanner;

public class Baekjoon3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chessmen = {1, 1, 2, 2, 2, 8};	// 기준이 될 체스말 기본 수량
		int length = chessmen.length;				 
		
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<length; i++) { 
			result.append(chessmen[i] - sc.nextInt());	// 기본 수량에서 입력값을 뺌
			result.append(" ");							// 구분을 위해 공백문자 추가
		}
		
		System.out.println(result.toString().trim());	//마지막  공백문자 제거 위해 trim 사용
		sc.close();
	}
}
