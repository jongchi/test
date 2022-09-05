package baekjoon;

import java.util.Scanner;

public class Baekjoon2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		float result = 0.0f;
		
		switch(input) {
		case "A+":
			result = 4.3f;
			break;
		case "A0":
			result = 4.0f;
			break;
		case "A-":
			result = 3.7f;
			break;
		case "B+":
			result = 3.3f;
			break;
		case "B0":
			result = 3.0f;
			break;
		case "B-":
			result = 2.7f;
			break;
		case "C+":
			result = 2.3f;
			break;
		case "C0":
			result = 2.0f;
			break;
		case "C-":
			result = 1.7f;
			break;
		case "D+":
			result = 1.3f;
			break;
		case "D0":
			result = 1.0f;
			break;
		case "D-":
			result = 0.7f;
			break;
		default : 
			result = 0.0f;
		}
		
		System.out.println(result);
				
	}

}
