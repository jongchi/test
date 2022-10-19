package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;
		int n = Integer.parseInt(br.readLine());
		
		Queue queue = new Queue();
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(br.readLine());
			String cmd = stk.nextToken();
			
			switch(cmd) {
				case "push" :
					queue.push(Integer.parseInt(stk.nextToken()));
					break;
				case "pop" :
					bw.write(queue.pop()+"\n");
					break;
				case "size" :
					bw.write(queue.size()+"\n");
					break;
				case "empty" :
					bw.write(queue.empty()+"\n");
					break;
				case "front" :
					bw.write(queue.front()+"\n");
					break;
				case "back" :
					bw.write(queue.back()+"\n");
					break;
			}
		}
		bw.flush();
	}

}

class Queue {
	List<Integer> list;
	int idx;
	
	public Queue() {
		list = new ArrayList<Integer>();
		idx = 0;
	}
	
	public void push(int x) {
		list.add(x);
		idx++;
	}
	
	public int pop() {
		int x = -1;
		
		if(idx > 0) {
			x = list.get(0);
			idx--;
			list.remove(0);
		}
		
		return x;
	}
	
	public int size() {
		return idx >=0 ? idx : 0 ;
	}
	
	public int empty() {
		return idx >0 ? 0 : 1;
	}
	
	public int front() {
		if(idx>0) {
			return list.get(0);
		}
		return -1;
	}
	
	public int back() {
		if(idx>0) {
			return list.get(idx-1);
		}
		return -1;
	}
}
