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
			int cnt = 0;
			String ret;
			String[] input = br.readLine().split("");
			Stack<String> stack = new Stack<String>();
			for(String str : input) {
				stack.push(str);
			}
			int size = stack.size();
			for(int j=0;j<size;j++) {
				if(stack.pop().equals(")")) {
					cnt++;
				} else {
					cnt--;
				}
				if(cnt<0) {
					ret = "NO";
					break;
				}
			}
			if(cnt == 0) {
				ret = "YES";
			} else {
				ret = "NO";
			}
			bw.write(ret+"\n");
		}
		bw.flush();
	}
}
