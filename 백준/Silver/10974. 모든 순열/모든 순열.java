import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] result = new int[N];
		boolean[] visited = new boolean[N];
		int depth = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		permutation(depth, N, arr, result, visited);

	}

	public static void permutation(int depth, int N, int arr[], int result[], boolean visited[]) {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i]=true;
				result[depth] = arr[i];
				permutation(depth + 1, N, arr, result, visited);
				visited[i]=false;
			}
		}
	}
}
