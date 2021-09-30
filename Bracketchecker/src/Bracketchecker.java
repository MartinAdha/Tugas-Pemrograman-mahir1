import java.util.Scanner;
import java.util.Stack;

public class Bracketchecker {
 
	static Scanner input = new Scanner(System.in);    
	public static void main(String args[]) {  
		
    	System.out.println("input rumus");
      String s = input.next();
        
        if(Symbolchecker(s))
        	System.out.println("Valid");
        else
        	System.out.println("Tidak valid");
    }

    public static boolean Symbolchecker(String s) {
      
    	Stack<Character> stack  = new Stack<Character>();
       
    	for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           
            if( c == '('  ) {     
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } 
        }
    	
        return stack.isEmpty();
    }
}