
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String[] arr = br.readLine().split(" ");
			if(arr[0].equals("0"))
				break;
			System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			
		}
		

	}

}
