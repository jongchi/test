package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Person> list = new ArrayList<Person>();
		
		StringTokenizer stk;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(br.readLine()," ");
			list.add(new Person(stk.nextToken(), stk.nextToken()));
		}
		
		for(Person p : list) {
			p.compareGrade(list);
		}
		
		list.forEach(p -> {
			try {
				bw.write(p.grade+" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		bw.flush();
		
	}
}

class Person {
	int x;
	int y;
	int grade;
	
	Person(String x, String y){			//키, 몸무게를 받아 사람 객체 생성
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		this.grade = 1;
	}
	
	public void compareGrade(List<Person> list) {	//list의 모든 person과 덩치 비교
		for(Person p : list) {
			if(x < p.x) {
				if(y < p.y) {
					grade++;
				}
			}
		}
	}
	
}
