package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baekjoon1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();											// set 사용해서 중복 값 제거
		
		for(int i=0;i<count;i++) {
			set.add(br.readLine());
		}
		
		List<String> list = new ArrayList(set);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {							
				if(str1.length() < str2.length()) {											// 단어 길이 비교							
					return -1;			
				} else if(str1.length() == str2.length() && str1.compareTo(str2) < 0) {		// 길이가 같을 경우 알파벳 순서 비교 
					return -1;
				} 
				return 1;
			}
		});
		
		for(String str : list) {
			sb.append(str+"\n");
		}
		System.out.println(sb);
		
	}
}
