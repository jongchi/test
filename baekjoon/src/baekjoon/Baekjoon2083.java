package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2083 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input;
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			input = bf.readLine();
			stk = new StringTokenizer(input);
			
			String name = stk.nextToken();
			int age = Integer.valueOf(stk.nextToken());
			int weight = Integer.valueOf(stk.nextToken());
			
			if(name.equals("#")) {
				System.out.println(sb);
				return;
			}
			
			sb.append(name+" ");
			
			
			if(age > 17) {
				sb.append("Senior\n");
			} else {
				if(weight >= 80) {
					sb.append("Senior\n");
				} else {
					sb.append("Junior\n");
				}
			}
		}
	}
}
