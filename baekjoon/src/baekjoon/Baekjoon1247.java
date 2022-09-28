package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon1247 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int cnt = 0;
		BigInteger zero = new BigInteger("0");
		
		
		while(cnt < 3) {
			int n = Integer.valueOf(bf.readLine());
			BigInteger sum = new BigInteger("0");
			for(int i=0; i<n; i++) {
				sum = sum.add(new BigInteger(bf.readLine())); 
			}
			if(sum.compareTo(zero) == 0) {
				result.append("0\n");
			} else if (sum.compareTo(zero) == -1){
				result.append("-\n");
			} else {
				result.append("+\n");
			}
			cnt++;
		}
		System.out.println(result);

	}

}
