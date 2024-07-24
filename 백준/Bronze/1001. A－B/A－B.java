import java.util.*;

public class Main {
	
	public static int sub(int a, int b) {
		int dif=a-b;
		return dif;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(), B = scanner.nextInt();
        
		int dif=sub(A, B);
        System.out.println(dif);
        scanner.close();
	}
}