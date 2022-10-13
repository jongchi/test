package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		double a = Double.valueOf(stk.nextToken());
		double b = Double.valueOf(stk.nextToken());
		double v = Double.valueOf(stk.nextToken());
		int day = 0;
		v -= a;												//먼저 최대 올라갈 수 있는 거리를 한 번 빼줌 -> 마지막 날
		
		day = (int)Math.ceil(v/(a-b));						//남은 날을 매일 올라갔다 미끄러졌다 하는 거리로 나눠주고 올림 처리
		day++;												//마지막 날을 더해줌
		
		System.out.println(day);
	}

}
