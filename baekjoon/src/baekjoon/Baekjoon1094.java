package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon1094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int stick = 64;								 	// 막대의 길이				
		int count = 0;									// 막대의 개수 
		
		int X = Integer.parseInt(bf.readLine());		// 목표값
		bf.close();
		
		while(true) {
			if(X < stick) {								// 막대가 목표값보다 크면 막대를 반띵
				stick /= 2;
			} else if (X > stick) {						// 막대가 목표값보다 작으면 목표값에서 막대만큼 뺌
				X -= stick;
				stick /= 2;
				count++;
			} else {									// 목표값과 막대 총합이 같으면 break;
				count++;
				break;
			}
		}
		
		System.out.println(count);
		
		
	}
}
