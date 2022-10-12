package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon15829 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.valueOf(br.readLine());
		String str = br.readLine();
		BigInteger r = new BigInteger("1");
		BigInteger r2 = new BigInteger("31");
		BigInteger m = new BigInteger("1234567891");
		BigInteger h = new BigInteger("0");
		
		for(int i=0;i<len;i++) {
			BigInteger input = new BigInteger(str.charAt(i)-96+"");
			h = h.add(input.multiply(r)) ;
			r = r.multiply(r2);
		}
		
		System.out.println(h.remainder(m));
		
	}

}
