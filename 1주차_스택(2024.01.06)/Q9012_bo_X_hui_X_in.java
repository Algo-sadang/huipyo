import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String ps;
		
		for(int i = 0; i < num; i++) {
			try {
			Stack<String> stack = new Stack<String>();
			ps = scan.next();
			for(int j = 0; j < ps.length(); j++) 
				if(ps.substring(j, j + 1).equals("(")) 
					stack.push(ps.substring(j, j + 1));
				 else 
					stack.pop();
			System.out.println(stack.size() > 0 ? "NO" : "YES");
			} catch(Exception e) {
				System.out.println("NO");
			}
		}
		scan.close();
	}

}
