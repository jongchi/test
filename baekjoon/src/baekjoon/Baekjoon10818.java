package baekjoon;

import java.util.*;

public class Baekjoon10818 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {							// n만큼 숫자를 받아서 리스트에 넣음
			int input = sc.nextInt();
			list.add(input);
		}
		Collections.sort(list);								// sort 활용해서 정렬
		
		System.out.println(list.get(0) +" "+list.get(n-1));	// 정렬된 list에서 첫 값과 마지막 값을 출력
		sc.close();

	}
	
	public static void main1(String[] args) {				// 시간이 오래 걸려 굳이 배열에 안 넣고 바로 해도 되지 않나? 생각함
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();								//  n만큼 숫자를 받음.
		int min = sc.nextInt();								// 0으로 넣음 -> 입력값중 0보다 작은 값 없을때 에러 생겨서 첫 숫자를
		int max = min;										// 최소값, 최대값으로 지정
		
		for(int i = 0; i<n-1; i++) {
			int j = sc.nextInt();
			if(j < min) {
				min = j;
			} else if( j > max) {
				max = j;
			}
		}
		
		System.out.println(min + " " + max);
		sc.close();
		
		
	}

}
