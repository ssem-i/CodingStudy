import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int three = 0;
		
		int five = N / 5;
		int temp = N - 5 * five;

		while (true) {
			if (temp % 3 != 0) {
				five = five - 1;
				//temp = temp + five * 5;
				temp=temp+5;
				if (five < 0) {
					System.out.println(-1);
					return;
				}
			} else if (temp % 3 == 0) {
				three = temp / 3;
				System.out.println(five + three);
				return;
			}
		}

	}

}
