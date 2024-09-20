import java.util.*;

public class Main {

	public static int dSum(int M) {
		int sum = 0;
		while (M > 0) {
			sum += M % 10; ////
			M /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 1;

		if (N == 1) {
			System.out.println("0");
			return;
		}

		for (M = 1; M < N; M++) {
			if (M + dSum(M) == N) {
				
				System.out.println(M);
				return;
			}

		}
		System.out.println("0");
	}

}
