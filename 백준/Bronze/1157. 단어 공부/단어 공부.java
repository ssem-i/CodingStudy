import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int[] al = new int[26];
		int maxIndex = 0;
		Arrays.fill(al, 0);
		int max = 0;
		char c='A';
		
		for (int i = 0; i < word.length(); i++) {
			
			if (97 <= word.charAt(i) && word.charAt(i) <= 122) {
				c = Character.toUpperCase(word.charAt(i));
			}
			else
				c = word.charAt(i);
			
			al[c-'A']++;
		}
		
		for (int i=0; i<al.length; i++) {
			if (al[i] != 0)
				if (al[i] > max) {
					max = al[i];
					maxIndex = i;
				}

		}
		for (int i=0; i<al.length; i++) {
			if(al[i]==max && i!=maxIndex) {
				System.out.println("?");
				return;
			}
		}
		//for (int num:al) {
		//	System.out.println(num);
		//}
		System.out.println((char)(maxIndex+65));
	}

}
