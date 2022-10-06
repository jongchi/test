package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.valueOf(br.readLine());
		
		for(int i=0;i<count;i++) {
			list.add(Integer.valueOf(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}
