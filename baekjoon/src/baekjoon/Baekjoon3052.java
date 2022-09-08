package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Set<Integer> set = new HashSet<Integer>(); 		// 중복된 나머지를 처리하기 위해 set 사용
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<10; i++) {
			int n = Integer.parseInt(bf.readLine())%42;	// 입력값을 42로 나눈 나머지
			set.add(n);
		}
		
		System.out.println(set.size());					// 중복되지 않은 나머지의 개수 출력
		bf.close();
	}

}
