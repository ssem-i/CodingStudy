import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		if (N < 2) {
            return;
        }
		boolean[] isPrime = new boolean[N+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2; i*i<=N; i++) {
			if(isPrime[i]) {
				for(int k=i*i;k<=N;k+=i) {
					isPrime[k]=false;
				}
			}
		}
		for (int i = Math.max(M, 2); i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
		
	}

}
