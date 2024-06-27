import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		
		for (int i=0;i<n;i++) {
			nums[i]=scanner.nextInt();
		}
		
		for (int k : nums) {
			if (isPrime(k)) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static boolean isPrime(int number) {
		if (number <2) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(number);i++) {
			if(number % i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
