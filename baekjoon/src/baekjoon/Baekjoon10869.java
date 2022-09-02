package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10869 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		StringBuffer sb = new StringBuffer();
		
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		
		sb.append(a+b+"\n").append(a-b+"\n").append(a*b+"\n").append(a/b+"\n").append(a%b);
		
		System.out.println(sb);
		bf.close();
	}

}
