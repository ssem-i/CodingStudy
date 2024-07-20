import java.util.*;

public class Main {
	
	public static StringBuilder vertical(char[][] words) {
		StringBuilder Vline = new StringBuilder();
		int numRows = words.length;
		
		for(int col=0; col<15; col++) {
            for (int row = 0; row < 5; row++) {
            	if(words[row][col]!='\0')
            		Vline.append(words[row][col]);
            }
		}
		return Vline;
	}

	public static void print(StringBuilder line) {
		System.out.print(line);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[][] words = new char[5][15];
		StringBuilder result;
		
		for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                words[i][j] = line.charAt(j);
            }
        }
		result=vertical(words);
		print(result);
		
		scanner.close();
	}
}