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

		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");

		int num1 = Integer.parseInt(input1[0]);
		int den1 = Integer.parseInt(input1[1]);

		int num2 = Integer.parseInt(input2[0]);
		int den2 = Integer.parseInt(input2[1]);

		int resDen = 0, resNum = 0;
		int max = 0;
		if (den1 != den2) {
			resDen = den1 * den2;
			resNum = num1 * den2 + num2 * den1;

		} else if (den1 == den2) {
			resDen = den1;
			resNum = num1 + num2;
		}

		max = gcd(resNum, resDen);
		resNum /= max;
		resDen /= max;
		bw.write(resNum + " " + resDen + "\n");
		bw.flush();
		bw.close();
	}

}
