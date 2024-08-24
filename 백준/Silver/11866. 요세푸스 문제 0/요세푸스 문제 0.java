import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<>();
		List<Integer> res = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		
		for(int i=0;i<N;i++)
			list.add(i+1);
		
		
		int removeI = 0;
		
		while(true) {
			removeI = (removeI + K - 1) % list.size();	////
			res.add(list.get(removeI));
			list.remove(removeI);
			if(list.isEmpty())
				break;
		}
		System.out.print("<");
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size() - 1) {
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i) + ", ");
            }
        }
        System.out.println(">");
	}

}
