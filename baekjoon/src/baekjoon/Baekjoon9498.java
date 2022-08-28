package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		if(input >= 90) {				// 90점 이상
			System.out.println("A");
		} else if (input >= 80){		// 80점 이상
			System.out.println("B");
		} else if (input >= 70) {		// 70점 이상
			System.out.println("C");
		} else if (input >= 60) {		// 60점 이상
			System.out.println("D");
		} else {						// 60점 미만
			System.out.println("F");
		}
		
	}

}
