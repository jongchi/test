package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon10952 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a+b;
			
			if(result == 0) {			// a == 0 / b == 0 일때
				break;
			}
			System.out.println(a+b);
		}
		sc.close();

	}

}
