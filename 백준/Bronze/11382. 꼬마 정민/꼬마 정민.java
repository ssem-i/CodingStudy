import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A, B, C, R;

        A = scanner.nextLong();
        B = scanner.nextLong();
        C = scanner.nextLong();
       
        R = A + B + C;
        System.out.println(R);

        scanner.close();
    }
}