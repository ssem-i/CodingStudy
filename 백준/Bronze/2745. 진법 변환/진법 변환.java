import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String N = input[0];	////
		int B = Integer.parseInt(input[1]);
		
		int res = Integer.parseInt(N, B);	////
		System.out.println(res);
	}

}
