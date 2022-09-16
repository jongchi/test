package baekjoon;

import java.util.Scanner;

public class Baekjoon1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		String result = "";
		
		if(x>y) {
			result = ">";
		} else {
			result = x<y ? "<"  : "==";
		}
		
		System.out.println(result);
		sc.close();

	}

}
