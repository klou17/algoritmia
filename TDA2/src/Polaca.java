import java.util.Stack;

public class Polaca {
	
	public String polaca(String cadena) {
		char array [] = cadena.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder out = new StringBuilder();
		
		for (int i=0; i<array.length; i++) {
			switch (array [i]) {
			case '^':
			case '*':
			case '/':
				out.append(' ');
	            stack.push(array[i]);
	            break;
			case '+':
			case '-':
				 while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
	                   out.append(' ');
	                   out.append(stack.pop());
	               }
	               out.append(' ');
	               stack.push(array[i]);
	               break;
			case '(':
				stack.push(array[i]);
	            break;
            case ')':
            	while (!stack.isEmpty() && stack.peek() != '(') {
                    out.append(' ');
                    out.append(stack.pop());
                }
                stack.pop();
                break;
            default:
                out.append(array[i]);
                break;
			}
		}
				
		while (!stack.isEmpty()) {
            out.append(' ');
            out.append(stack.pop());
        }

        return out.toString();
		}
	}

