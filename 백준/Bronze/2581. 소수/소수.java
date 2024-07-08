import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		int sum=0, min=10001;
		boolean found=false;
		
		for (int i=M;i<=N;i++) {
			if(isPrime(i)) {
				sum+=i;
				if(i<min) 
					min=i;
			found=true;
			}
			
		}
		if(found) {
		System.out.println(sum);
		System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for (int j=2; j<= Math.sqrt(num);j++) { //// 
			if(num%j==0) {
				return false;
			}
		}
		return true;
	}

}
