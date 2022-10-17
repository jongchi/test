package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack stack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			n--;
			stk = new StringTokenizer(br.readLine()," ");
			String cmd = stk.nextToken();
			
			switch(cmd) {
				case "push":
					stack.push(Integer.parseInt(stk.nextToken()));
					break;
				case "pop":
					addText(sb, stack.pop());
					break;
				case "size":
					addText(sb, stack.size());
					break;
				case "empty":
					addText(sb, stack.empty());
					break;
				case "top":
					addText(sb, stack.top());
					break;
			}
			
		}
		System.out.println(sb);
		
	}
	
	private static void addText(StringBuilder sb, int x) {
		sb.append(x+"\n");
	}

}

class Stack {
	List<Integer> list;
	int index;
	
	
	public Stack() {
		index = 0;
		list = new ArrayList<Integer>();
	}
	
	public void push(int x) {
		list.add(x);
		index++;
	}
	
	public int pop() {
		int x;
		if(index>0) {
			x = list.get(index-1);
			x = list.remove(index-1);
			index--;
		} else {
			x = -1;
		}
		return x;
	}
	
	public int size() {
		return index;
	}
	
	public int empty() {
		return index>0? 0 : 1;
	}
	
	public int top() {
		int x;
		if(index>0) {
			x = list.get(index-1);
		} else {
			x = -1;
		}
		return x;
	}
	
}
