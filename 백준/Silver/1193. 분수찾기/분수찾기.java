import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		scanner.close();
		
		int n=1, sum=0, num=0, den=0;
		
		while(true) {
			sum=n*(n+1)/2;
			if(X<=sum)
				break;
			n++;
		}
		int offset=sum-X;
		
		if(n%2==0) {
			num=n-offset;
			den=n-num+1;
		}
		else {
			num=1+offset;
			den=n-num+1;
		}
		System.out.println(num + "/" + den);
	}
}
