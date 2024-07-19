import java.util.*;

public class Main {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int a, int b, int gcd) {
		return (a * b) / gcd;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int gcd = gcd(A, B);
		int lcm = lcm(A, B, gcd);

		System.out.println(gcd);
		System.out.println(lcm);
		scanner.close();
	}
}