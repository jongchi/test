package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		String input = bf.readLine().toUpperCase();
		int max = 0;										// 가장 많은 개수를 찾기 위한 값
		char result = '?';									
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(map.get(ch) == null) {						// 해당 문자가 처음 사용되었을 때
				map.put(ch, 1);
			} else {										// 기존에 사용된 적 있을 때 
				map.put(ch, map.get(ch)+1);
			}
		}
		
		for(char ch : map.keySet()) {						// map에서 가장 많이 나온 문자 찾기
			int i = map.get(ch);
			if(i > max) {
				max = map.get(ch);
				result = ch; 
			} else if(i == max) {							// 최대값과 같은 문자가 나오면 결과값을 '?'로 변경
				result = '?';
			}
			
		}
		
		System.out.println(result);
		bf.close();
	}

}
