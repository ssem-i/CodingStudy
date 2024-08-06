import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			String cmd = arr[0];

			switch (cmd) {
			case "push":
				int X = Integer.parseInt(arr[1]);
				deque.addLast(X);
				break;
			case "pop":
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.removeFirst() + "\n");
				break;
			case "size":
				bw.write(deque.size() + "\n");
				break;
			case "empty":
				bw.write(deque.isEmpty() ? "1\n" : "0\n");
				break;
			case "front":
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else
					bw.write(deque.peekFirst() + "\n");
				break;
			case "back":
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.peekLast() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

}
