package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Baekjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int input = sc.nextInt();
			if(input < X) {
				sb.append(input+" ");
			}
		}
		System.out.println(sb);
		sb.close();
		
	}

}
