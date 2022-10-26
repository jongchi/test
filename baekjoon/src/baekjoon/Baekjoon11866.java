package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken())-1;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		
		bw.write("<");
		while(!queue.isEmpty()) {
			for(int i=0;i<=k;i++) {
				if(i==k) {
					bw.write(queue.poll()+"");
					if(!queue.isEmpty()) {
						bw.write(", ");
					}
				} else if(!queue.isEmpty()){
					queue.offer(queue.poll());
				}
			}
		}
		bw.write(">");
		bw.flush();
		
	}

}
