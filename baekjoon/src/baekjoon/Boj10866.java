package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		Deque deque = new Deque();
		int t = Integer.parseInt(stk.nextToken());
		
		while(t>0) {
			stk = new StringTokenizer(br.readLine()," ");
			String cmd = stk.nextToken();
			
			switch(cmd) {
				case "push_front" :
					deque.push_front(Integer.parseInt(stk.nextToken()));
					break;
				case "push_back" :
					deque.push_back(Integer.parseInt(stk.nextToken()));
					break;
				case "pop_front" :
					intWriter(bw, deque.pop_front());
					break;
				case "pop_back" :
					intWriter(bw, deque.pop_back());
					break;
				case "size" :
					intWriter(bw, deque.size());
					break;
				case "empty" :
					intWriter(bw, deque.empty());
					break;
				case "front" :
					intWriter(bw, deque.front());
					break;
				case "back" :
					intWriter(bw, deque.back());
					break;
			}
			t--;
		}
		bw.flush();
	}
	
	public static void intWriter(BufferedWriter bw, int x) throws IOException {
		bw.write(Integer.toString(x));
		bw.newLine();
	}

}

class Deque {
	
	List<Integer> deque;
	int size = 0;
	
	public Deque() {
		deque = new ArrayList<Integer>();
	}
	
	public void push_front(int x) {
		deque.add(0, x);
		size++;
	}
	
	public void push_back(int x) {
		deque.add(x);
		size++;
	}
	
	public int pop_front() {
		
		if(size>0) {
			size--;
			int x = deque.get(0);
			deque.remove(0);
			return x;
		}
		return -1;
	}
	
	public int pop_back() {
		if(size>0) {
			size--;
			int x = deque.get(size);
			deque.remove(size);
			return x;
		}
		return -1;
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		return size>0 ? 0 : 1;
	}
	
	public int front() {
		return size>0 ? deque.get(0) : -1;
	}
	
	public int back() {
		return size>0 ? deque.get(size-1) : -1;
	}
	
}
