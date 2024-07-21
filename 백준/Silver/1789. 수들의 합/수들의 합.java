import java.util.*;

public class Main {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long S=scanner.nextLong();	////
		long N=0;
		
			////
		long left = 1;
        long right = (long) Math.sqrt(2 * S);
        
       
        long mid = (left + right) / 2;
		while(true) {
			
			long tnum = mid * (mid + 1) / 2;
		
			if(tnum>S) {
				N=mid-1;
				break;
			}
			else
				mid++;
		}
		System.out.println(N);
	
		scanner.close();
	}
}