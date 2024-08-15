import java.io.*;

public class Main {

	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tCase = Integer.parseInt(br.readLine());
		int A, B, gcd = 0, lcm = 0;
		for (int i = 0; i < tCase; i++) {
			String[] input = br.readLine().split(" ");
			A = Integer.parseInt(input[0]);
			B = Integer.parseInt(input[1]);

			gcd = gcd(A, B);
			lcm = (A * B) / gcd;
			bw.write(lcm + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
