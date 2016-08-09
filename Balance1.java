import java.util.Stack;

public class Balance1 {
	

    public static void main(String args[]) {

        System.out.println(balanced("{[()[}]]"));
        System.out.println(balanced("((())}"));
        System.out.println(balanced("()[]"));
    }

    public static String balanced(String s) {
    	
    	
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) return "Not Balanced";
                if(stack.pop() != '[') return "Not balanced";

            }else if(c == ')') {
                if(stack.isEmpty()) return "Not Balanced";
                if(stack.pop() != '(') return "Not Balanced";

            }else if(c == '}') {
                if(stack.isEmpty()) return "Not Balanced";
                if(stack.pop() != '{') return "Not Balanced";
            }

        }
        return "Balanced";
    }
}


