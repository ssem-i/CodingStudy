import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigInteger num = BigInteger.ONE, denom = BigInteger.ONE;

		for (int i = n; i > (n - m); i--)
			num = num.multiply(BigInteger.valueOf(i));
		for (int i = m; i > 1; i--)
			denom = denom.multiply(BigInteger.valueOf(i));
		BigInteger result = num.divide(denom);
		System.out.println(result);
	}

}
