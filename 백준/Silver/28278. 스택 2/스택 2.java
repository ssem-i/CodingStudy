import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			String[] command = br.readLine().split(" ");
            int c = Integer.parseInt(command[0]);
            
			if (c == 1) {
				int X = Integer.parseInt(command[1]);
				deque.add(X);
			} else if (c == 2) {
				if (deque.peekLast() == null)
					System.out.println("-1");
				else {
					System.out.println(deque.peekLast());
					deque.pollLast();
				}
			} else if (c == 3) {
				System.out.println(deque.size());

			} else if (c == 4) {
				if(deque.isEmpty()) 
					System.out.println("1");
				else 
					System.out.println("0");

			} else if (c == 5) {
				if (deque.peekLast() == null)
					System.out.println("-1");
				else 
					System.out.println(deque.peekLast());
			}
		}
	}

}
