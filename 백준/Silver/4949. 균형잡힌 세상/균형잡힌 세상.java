import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();
			boolean result = true;
			Stack<Character> stack = new Stack<>();
			if (input.equals("."))
				break;
			if (input.charAt(input.length() - 1) == '.') {
				for (int i = 0; i < input.length(); i++) {
					char c = input.charAt(i); ////
					switch (c) {
					case '[':
					case '(':
						stack.push(c);
						break;
						
					case ']':
						if (stack.isEmpty()||stack.peek()!='[') {
							result = false;
							break;
						}
						stack.pop();
						break;
					case ')':
						if (stack.isEmpty()||stack.peek()!='(') {
							result = false;
							break;
						}
						stack.pop();
						break;
					}
					if (!result) break;
				}
				if (result&& stack.isEmpty())
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}

	}
}
