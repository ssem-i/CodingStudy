import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> wordSet = new HashSet<>();
		int a=0;
		for(int i=0; i<N; i++) {
			String input=br.readLine();
			wordSet.add(input);
			
		}
		
		List<String> wordList = new ArrayList<>(wordSet);
		

		Collections.sort(wordList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length())
					return s1.compareTo(s2);
				else
					return s1.length()-s2.length();
			}
			
		});
		
		for(int i=0;i<wordList.size();i++)
			System.out.println(wordList.get(i));
		
		
		
		br.close();
	}

}
