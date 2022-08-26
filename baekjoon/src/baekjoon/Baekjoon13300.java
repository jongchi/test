package baekjoon;

import java.util.Scanner;

public class Baekjoon13300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] students = new int[2][6];		// [성별][학년]으로 2차원 배열 생성 
		int room = 0;							// 총 방 필요 개수		
		
		String str[] = sc.nextLine().split(" "); // 참가 학생 수 n / 방 최대 투숙 학생 k
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		for(int i = 0; i<n; i++) {				// 참가 학생 수 n만큼 실행
			String input[] = sc.nextLine().split(" "); 
			int gender = Integer.parseInt(input[0]); // 성별 0 = 여학생 / 1 남학생	
			int grade = Integer.parseInt(input[1]); 
			students[gender][grade-1]++;	// 실제 배열 idx는 0~5라서 각 학년에서 1씩 뺌
		}
		for(int i = 0; i<students.length; i++) {
			for(int j = 0; j<students[0].length; j++) {
				int count = students[i][j];
				if(count == 0) {		// 해당 학년, 성별의 학생 수가 0일때는 pass
					continue;
				} else if(count < k ) { // 학생 수가 방 최대 인원보다 작을때는 방 1개 필요 
					room ++;
				} else {
					room += count/k; // 학생 수가 최대 인원보다 많을 경우 
					if(count%k > 0) {	// 남은 인원에 대한 방 추가
						room ++;
					}
				}
			}
		}
		System.out.println(room);
	}
}
