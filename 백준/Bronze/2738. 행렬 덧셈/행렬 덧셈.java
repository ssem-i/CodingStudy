import java.io.IOException;
import java.util.*;
public class Main {

	public static void main(String[] args)throws IOException{
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		//int[][] res = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				A[i][k]=sc.nextInt();
				
			}
		}
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				B[i][k]=sc.nextInt();
				
			}
		}
		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				System.out.print((A[i][k]+B[i][k])+" ");
			}
			System.out.println();
		}
	}
}
