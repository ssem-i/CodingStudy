import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int A[] = new int[10];
		int N=7, T=0;
		
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for (int j=0;j<T;j++) {
			for (int i=0;i<10;i++) {
				A[i]=scanner.nextInt();
			}
			Arrays.sort(A);
			System.out.println(A[N]);
		}
		scanner.close();
	}
	
}
