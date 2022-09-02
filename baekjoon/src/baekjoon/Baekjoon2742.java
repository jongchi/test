package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i = input; i>0; i--) {
			sb.append(i+"\n");
		}

		System.out.println(sb);
		bf.close();
	}

}
