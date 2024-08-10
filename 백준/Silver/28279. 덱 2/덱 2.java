import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Deque<Integer> deque = new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int X = 0;
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			String cmd = arr[0];

			switch (cmd) {
			case "1":
				X = Integer.parseInt(arr[1]);
				deque.addFirst(X);
				break;
			case "2":
				X = Integer.parseInt(arr[1]);
				deque.addLast(X);
				break;
			case "3":
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.removeFirst()+"\n");
				}
				break;
			case "4":
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.removeLast()+"\n");
				}
				break;
			case "5":
				bw.write(deque.size()+"\n");
				break;
			case "6":
				if (deque.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
			case "7":
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekFirst()+"\n");
				}
				break;
			case "8":
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekLast()+"\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
