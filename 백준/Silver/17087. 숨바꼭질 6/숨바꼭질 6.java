import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		//System.out.println(N+","+ S);
		int[] A = new int[N];
		int[] distance=new int[N];
		
		input = br.readLine().split(" ");
		for (int i=0; i<N; i++) {
			A[i]=Integer.parseInt(input[i]);
			distance[i]=Math.abs(S-A[i]);
		}
		int D=distance[0];
		for(int i=1;i<N;i++) {
			D = gcd(D, distance[i]);
		}
		System.out.println(D);
	}
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}

}
