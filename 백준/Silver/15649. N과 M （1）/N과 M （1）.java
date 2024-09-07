import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		List<List<Integer>> result = new ArrayList<>();
		boolean[] visited = new boolean[N];
		permutation(arr, result, new ArrayList(), M, visited);

		for (List<Integer> perm : result) {
			for (int i = 0; i < perm.size(); i++) {
				System.out.print(perm.get(i) + " ");
			}
			System.out.println();
		}
	}

	public static void permutation(int[] arr, List<List<Integer>> result, List<Integer> current, int M,
			boolean[] visited) {
		if (current.size() == M) {
			result.add(new ArrayList<>(current));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				current.add(arr[i]);
				permutation(arr, result, current, M, visited);
				current.remove(current.size() - 1);
				visited[i] = false;
			}
		}
	}
}
