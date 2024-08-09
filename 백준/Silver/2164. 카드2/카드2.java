import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException{
		Deque<Integer> deque = new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			deque.addLast(i);
		}
		int f;
		while(deque.size()>1) {
			deque.removeFirst();
			
			f=deque.getFirst();
			deque.removeFirst();
			deque.addLast(f);
			
		}
		
		System.out.println(deque.getFirst());
	}

}
