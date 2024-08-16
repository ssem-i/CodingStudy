import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double max = 0;
		double sum = 0;

		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];

		String[] input = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(input[i]);
			max = score[i] > max ? score[i] : max;
			
			//System.out.println("max:" + max);
		}
		
		for (int i = 0; i < N; i++) {
			sum += (score[i] / max) * 100;
		}
		
		double mean=sum/N;
		bw.write(String.format("%.2f", mean));

		bw.flush();
		bw.close();
		br.close();
	}

}
