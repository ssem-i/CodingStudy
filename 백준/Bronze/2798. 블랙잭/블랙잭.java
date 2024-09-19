import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt(); // 합
		int result = 0, sum = 0;

		Integer[] cards = new Integer[N];
		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int k = i+1; k < N; k++) {
				for (int j = k+1; j < N; j++) {

					sum = cards[i] + cards[k] + cards[j];
					if (sum <= M && sum > result)
						result = sum;
				}
			}
		}

		System.out.println(result);
	}

}
