package baekjoon;

import java.util.Scanner;

public class Baekjoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();								// 첫 번째로 입력 받은 수
		int M = sc.nextInt();								// 두 번째로 입력 받은 수
		
		int	resultN = (N/100) + (N%100/10*10) + (N%10*100); // 100의 자리를 1로 10의 자리는 그대로 1의 자리는 100으로
		int resultM = (M/100) + (M%100/10*10) + (M%10*100);
		
		System.out.println(resultN > resultM ? resultN : resultM);
	}

}
