import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	public static int GCD(int a, int b) {
		while(b!=0) {
			int r= a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] gaps = new int[N - 1]; 
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = arr[i + 1] - arr[i];
        }
        
        int dis = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            dis = GCD(dis, gaps[i]);
        }

        for (int gap : gaps) {
            count += (gap / dis) - 1; 
        }
		System.out.println(count);
	}

}
