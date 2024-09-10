import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			
			if(n==0) break;
			if(n==1) {
				System.out.println("1");
				continue;
			}
			
			int count=0;
			boolean[] isPrime = new boolean[2*n+1];
			Arrays.fill(isPrime, true);
			for(int i=2; i*i<=2*n; i++) {
				if(isPrime[i]) {
					for(int k=i*i;k<=2*n;k+=i) {
						isPrime[k]=false;
					}
				}
			}
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
