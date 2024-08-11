import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arrStr = br.readLine().split(" ");
		int[] arr = new int[N];
		int count=0;
		
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(arrStr[i]);
		}
		
		int find=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			if(arr[i]==find)
				count++;
		}
		System.out.println(count);
	}

}
