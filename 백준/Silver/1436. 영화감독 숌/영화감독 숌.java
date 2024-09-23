import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 666; //// 666부터 시작
		int count = 0;

		while (true) {
			// resStr = res+"";
			// if(resStr.indexOf("666")>=0){
			if (Integer.toString(res).contains("666")) { ////
				count++;
			}
			if (count == N) {
				System.out.println(res);
				return;
			}
			res++;
		}
	}
}
