import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		int re = 0;
		int[] arrRe = new int[42];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			re = num % 42;
			arrRe[re]++;
		}
		
		for (int i = 0; i < 42; i++) {
			if (arrRe[i] > 0)
				count++;
		}
		System.out.println(count);
	}

}
