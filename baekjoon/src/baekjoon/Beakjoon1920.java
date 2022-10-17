package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Beakjoon1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		stk = new StringTokenizer(br.readLine()," ");
		while(stk.hasMoreTokens()) {
			map.put(stk.nextToken(),1);
			n--;
		}
		
		int m = Integer.parseInt(br.readLine());
		stk = new StringTokenizer(br.readLine()," ");
		while(stk.hasMoreTokens()) {
			sb.append(map.getOrDefault(stk.nextToken(), 0)+"\n");			//숫자가 있으면 1 없으면 0
		}
		
		System.out.println(sb);

	}

}
