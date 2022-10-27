package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		int count = 0;
		for(int i =0; i<N; i++) {
			Set<Character> set = new HashSet<Character>();
			String input = bf.readLine();
			set.add(input.charAt(0));
			
			if(input.length() > 1) {
				for(int j=1; j<input.length(); j++) {
					char ch = input.charAt(i);
					if(ch == input.charAt(i-1)) {
						continue;
					} else {
						if(set.equals(ch)) {
							break;
						} else {
							
						}
					};
				}
			} else if (input.length() == 1){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
