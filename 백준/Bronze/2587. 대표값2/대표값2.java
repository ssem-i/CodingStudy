import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[5];
		int median=0, mean=0, sum=0;
		
		for(int i=0;i<5;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		
		mean=sum/5;
		median=arr[2];
		
		bw.write(mean+"\n"+median);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
