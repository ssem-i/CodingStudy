import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int croatiaCount = 0, nCount=input.length();		
		String str = "";

		for (int i = 0; i < input.length(); i++) {
			str = str + input.charAt(i);
			for (String c : croatia) {
				if (str.contains(c)) {
					//System.out.println(str);
					croatiaCount++;
					nCount-=c.length();
					str = "";
				}
			}
		}
		System.out.println(croatiaCount+nCount);
		
		/*
		for (String c : croatia) {
			if (input.contains(c)) {
				croatiaCount++;
				int len = c.length();
				nCount -= len;
				System.out.println(len);
			}
		}
		System.out.println(croatiaCount + nCount);
		*/
	}

}
