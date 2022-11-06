package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		int length = n.length();
		
		int number = Integer.parseInt(n);
		int ret = 0;
		
		for(int i=0;i<number;i++) {
			int num = i;
			int sum = 0;
			
			for(int j=0;j<length;j++) {
				sum += num % 10;
				num /= 10;
			}
			if(number == i+ sum) {
				ret = i;
				break;
			}
		}
		
		System.out.println(ret);
		
	}

}
