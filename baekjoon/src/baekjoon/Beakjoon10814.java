package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Beakjoon10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;
		List<User> list = new ArrayList<User>();
		
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(br.readLine(), " ");
			list.add(new User(i, Integer.parseInt(stk.nextToken()), stk.nextToken()));
		}
		
		Collections.sort(list);
				
		for(User user : list) {
			bw.write(user.toString()+"\n");
			
		}
		
		bw.flush();
	}

}

class User implements Comparable<User>{
	int idx;
	int age;
	String name;
	
	public User(int idx, int age, String name) {
		this.idx = idx;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age+" "+name; 
	}

	@Override
	public int compareTo(User o) {
		if(this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			if(this.idx < o.idx) {
				return -1;
			} else {
				return 1;
			}
		} 
		return 1;
	}
	
}
