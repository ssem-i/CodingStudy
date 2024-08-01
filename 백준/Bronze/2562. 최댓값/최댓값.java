import java.util.*;

public class Main {

	public static void main(String[] args) {
		int num[] = new int[9];
		int max=0, index=0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			num[i]=scanner.nextInt();
			if(num[i]>max) {
				max=num[i];
				index=i+1; 
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
