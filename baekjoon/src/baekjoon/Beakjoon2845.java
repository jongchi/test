package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Beakjoon2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		int l = Integer.parseInt(stk.nextToken());
		int p = Integer.parseInt(stk.nextToken());
		
		int people = l * p;
		
		stk = new StringTokenizer(br.readLine(), " ");
		while(stk.hasMoreTokens()) {
			bw.write(Integer.parseInt(stk.nextToken()) - people+" ");
		}
		
		bw.flush();
	}

}
