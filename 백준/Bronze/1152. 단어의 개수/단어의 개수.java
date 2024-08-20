import java.io.*;;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		if(input==null || input.trim().isEmpty())  ////
			System.out.println(0);
		else {
		input = input.trim();	
		String[] arr = input.split(" ");
		System.out.println(arr.length);
		}
	}

}
