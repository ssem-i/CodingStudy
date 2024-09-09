import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int M = sc.nextInt();  
   
        int[] result = new int[M];
        backtrack(N, M, 1, 0, result);
    }

    public static void backtrack(int N, int M, int start, int depth, int[] result) {
 
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            result[depth] = i;  
            backtrack(N, M, i + 1, depth + 1, result);  
        }
    }
}
