package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Baekjoon1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		
		boolean[] primeNumber = new boolean[1001];					//1000까지 에라토스테네스의 체로 소수 판별
		Arrays.fill(primeNumber, true);
		
		int cnt = 0;
		
		primeNumber[0] = false;
		primeNumber[1] = false;
		
		for(int i=2;i*i<=1000;i++) {
			if(primeNumber[i]) {
				for(int j=i*i; j<=1000; j+=i) {
					primeNumber[j] = false;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		stk = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++) {
			
			int x = Integer.parseInt(stk.nextToken());
			if(primeNumber[x]) {									
				cnt++;
			}
			
		}		
		System.out.println(cnt);
		
	}

}
