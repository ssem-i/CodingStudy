import java.util.*;

public class Main {
	public static void main(String[] args) {

		int total=0, side=2;
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0;i<N;i++) {
			side+=side-1;
			total=side*side;	
		}
		System.out.println(total);
	}
}