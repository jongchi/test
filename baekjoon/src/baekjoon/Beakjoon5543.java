package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int burger1 = Integer.valueOf(br.readLine());
		int burger2 = Integer.valueOf(br.readLine());
		int burger3 = Integer.valueOf(br.readLine());
		int coke = Integer.valueOf(br.readLine());
		int cider = Integer.valueOf(br.readLine());
		
		int minBurger = burger1 < burger2 ? burger1 : burger2;
		if(minBurger > burger3) {
			minBurger = burger3;
		}
		
		int minBev = coke < cider ? coke : cider;
		
		System.out.println(minBurger + minBev - 50);
		
	}

}
