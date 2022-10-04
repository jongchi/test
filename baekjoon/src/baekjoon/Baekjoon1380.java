package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1380 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		List<String> students = new ArrayList<String>();							// 들어오는 순서대로 이름 저장
		HashSet<Integer> earrings = new HashSet<Integer>();							// 귀걸이 압수당한 리스트 확인
		int caseNumber = 1;
		while(true) {
			int count = Integer.valueOf(br.readLine());
			
			if(count == 0) {
				break;
			} else {
				students.clear();													// 시나리오마다 리셋													
				earrings.clear();
				for(int i=0;i<count;i++) {
					students.add(br.readLine());
				}
				
				for(int i=0;i<count*2-1;i++) {
					stk = new StringTokenizer(br.readLine()," ");
					int earring = Integer.valueOf(stk.nextToken());
					if(earrings.contains(earring)) {
						earrings.remove(earring);
					} else {
						earrings.add(earring);
					}
				}
				int number = earrings.iterator().next();
				sb.append(caseNumber++ +" "+students.get(number-1)+"\n");
			}
		}
		System.out.println(sb);
		
	}
}
