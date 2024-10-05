import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int groupWordCount=0;
		
		for(int i=0; i<N; i++) {
			int arr[] = new int[26];
			boolean group = true;
			String input = sc.next();	
			
			for(int k=0; k<input.length();k++) {
				if(k>0 && (input.charAt(k)==input.charAt(k-1)))
					continue; //
				//System.out.println(k +" "+ input.charAt(k));

				int index = input.charAt(k)-'a';
				if(arr[index]==1) {
					//System.out.println("x");
					group=false;
					break;	//
				}
				arr[index]=1;
			}
			if(group==true)
				groupWordCount++;
		}
		System.out.println(groupWordCount);
	}

}
