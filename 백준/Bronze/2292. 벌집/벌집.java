import java.util.*;

public class Main {

	public static void main(String[] args) {
 		long rooms = 1, floor = 1;

		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();

		while (N > rooms) {
			rooms += 6 * floor;
			floor++;

			if (N <= rooms)
				break;
		}
		System.out.println(floor);
	}
}