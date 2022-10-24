package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine()); 			// 총 풀어야 하는 국어 페이지
		int b = Integer.parseInt(br.readLine());			// 총 풀어야 하는 수학 페이지
		double c = Integer.parseInt(br.readLine());			// 하루에 풀 수 있는 국어 페이지
		double d = Integer.parseInt(br.readLine());			// 하루에 풀 수 있는 수학 페이지
		
		int korean = (int)Math.ceil(a/c);
		int math = (int)Math.ceil(b/d);
		
		int ret = korean > math ? l-korean : l-math;
		System.out.println(ret);
		
	}

}
