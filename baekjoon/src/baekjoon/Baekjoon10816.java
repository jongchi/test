package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<Integer, Integer> card = new HashMap<Integer, Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());					
		StringTokenizer stk = new StringTokenizer(bf.readLine()," ");				
		
		StringBuilder sb = new StringBuilder();
		while(stk.hasMoreTokens()) {
			int num = Integer.valueOf(stk.nextToken());
			if(card.get(num) != null) {
				card.put(num, card.get(num)+1);
			} else {
				card.put(num, 1);
			}
		}
		
		int M = Integer.valueOf(br.readLine());
		stk = new StringTokenizer(br.readLine()," ");
		while(stk.hasMoreTokens()) {
			int num = Integer.valueOf(stk.nextToken());
			if(card.get(num) != null) {
				sb.append(card.get(num)+" ");
			} else {
				sb.append(0+" ");
			}
		}
		
		System.out.println(sb);
	}

}
