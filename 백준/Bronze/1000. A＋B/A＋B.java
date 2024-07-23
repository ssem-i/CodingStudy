import java.util.*;

public class Main {
	
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(), B = scanner.nextInt();
        
		int sum=add(A, B);
        System.out.println(sum);
        scanner.close();
	}
}