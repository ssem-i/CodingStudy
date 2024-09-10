import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 123456*2;
		boolean[] isPrime = new boolean[MAX+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2; i*i<=MAX; i++) {
			if(isPrime[i]) {
				for(int k=i*i;k<=MAX;k+=i) {
					isPrime[k]=false;
				}
			}
		}
		
		while(true) {
			int n = sc.nextInt();	
			if(n==0) break;
			int count=0;
			
			for (int i = n+1; i <= 2*n; i++) {
	            if (isPrime[i]) {
	                count++;
	            }
	        }
			System.out.println(count);
		}
		sc.close();
	}
}
