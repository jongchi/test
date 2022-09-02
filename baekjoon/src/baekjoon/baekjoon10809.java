package baekjoon;

import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		
		int[] al = new int[26];
		for(int i = 0; i< al.length; i++) {
			al[i] = -1; 
		}
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int length = input.length();
		
		for(int i = 0; i< length; i++) {
			char ch = input.charAt(i);
			int idx = ch-97;
			if(al[idx] == -1) {
				al[idx] = i;
			}
		}
		
		for(int i = 0; i<al.length; i++) {
			System.out.print(al[i]);
			if(i < al.length-1) {
				System.out.print(" ");
			}
		}
		sc.close();

	}

}
