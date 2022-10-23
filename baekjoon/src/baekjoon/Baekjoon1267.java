package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1267 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;
		
		int priceYoung = 0;
		int priceMin = 0;
		int n = Integer.parseInt(br.readLine());
		
		stk = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++) {
			int time = Integer.parseInt(stk.nextToken())+1;
				priceYoung += Math.ceil(time/30d)*10;
				priceMin += Math.ceil(time/60d)*15;
		}

		if(priceYoung > priceMin) {
			bw.append("M "+priceMin);
		} else if (priceYoung < priceMin){
			bw.append("Y "+priceYoung);
		} else {
			bw.append("Y M "+priceYoung);
		}
		bw.flush();

	}

}
