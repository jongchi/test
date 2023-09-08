package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			boolean complete = true;
			String input = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			for(int j=0;j<input.length();j++) {
				char ch = input.charAt(j);
				if(ch == '(') {
					stack.push(ch);
				} else {
					if(stack.size() == 0) {
						complete = false;
						continue;
					} else {
						stack.pop();
					}
				}
			}
			
			if(complete) {
				if(stack.size() == 0) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			} else {
				bw.write("NO\n");
			}
		}
		bw.flush();
	}
}
