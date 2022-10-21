package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Beakjoon11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int ret = 1;
		int n = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());

		ret = factorial(n) / (factorial(n-k)*factorial(k));
		
		bw.write(String.valueOf(ret));
		bw.flush();

	}
	
	private static int factorial(int x) {
		int val = 1;
		for(int i=x;i>0;i--) {
			val *= i;
		}
		return val;
	}

}
