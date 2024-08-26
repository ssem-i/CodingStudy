import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int M = Integer.parseInt(br.readLine());
		int[] find = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(cards);
		for (int i = 0; i < M; i++) {
			if (Arrays.binarySearch(cards, find[i]) >= 0) {
				sb.append("1 ");
			} else
				sb.append("0 ");
		}

		System.out.println(sb.toString());
	}
}
