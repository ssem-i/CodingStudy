import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		int total = 0;

		for (int i = 1; i <= B; i++)
			for (int k = 0; k < i; k++)
				list.add(i);

		for (int k = A - 1; k < B; k++)
			total += list.get(k);

		System.out.println(total);
	}
}