import java.util.*;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        System.out.print("Output: ");
        System.out.println(postfixEvaluate(n));               

    }
    
    public static int postfixEvaluate(String exp) {
	 	Stack<Integer> s = new Stack<Integer> ();
		Scanner tokens = new Scanner(exp);
		
		while (tokens.hasNext()) {
			if (tokens.hasNextInt()) {
				s.push(tokens.nextInt());
			} else {
				int num2 = s.pop();
				int num1 = s.pop();
				String op = tokens.next();
				
				if (op.equals("+")) {
					s.push(num1 + num2);
				} else if (op.equals("-")) {
					s.push(num1 - num2);
				} else if (op.equals("*")) {
					s.push(num1 * num2);
				} else {
					s.push(num1 / num2);
				} 
			//  "+", "-", "*", "/"
			}
		}
		return s.pop();
    }
}