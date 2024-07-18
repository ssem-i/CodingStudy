
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int num=0, count=0;
		
		for (int i = 1; i <= N; i++) {
			if(N%i==0) 
				count++;
				if(count==K) {
					num=i;
					break;
				}
		}
		System.out.println(num);
		scanner.close();
	}
}