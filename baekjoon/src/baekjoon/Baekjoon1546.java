package baekjoon;

import java.util.Scanner;

public class Baekjoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();		// 입력할 과목 수
		float max = 0;					// 받은 점수 중 최고점
		float sum = 0;					// 모든 점수 합계
		int[] arr = new int[count];		// 과목 수 만큼의 배열을 생성
		
		for(int i=0; i<count; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0;i<count; i++) {
			sum += arr[i]/max*100;		// 받은 점수 중 최고점으로 현재 점수를 재정의하고 합계에 더함
		}
		
		System.out.println(sum/count);	// 총점/과목 수로 평균 
		sc.close();
	}

}
