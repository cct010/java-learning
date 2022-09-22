import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-22
 * Time: 20:13
 */
public class Test {
    public static void main(String[] args) {
        String s = new String();
        s = "((()))}";
        boolean b = isValid(s);
        System.out.println(b);
    }
    public static  boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                stack.push(ch);
            }
            else {
                if(stack.empty()){
                    return false;
                }
                char top = stack.peek();
                if((ch == '}'&&top == '{')||(ch == ']'&&top == '[')||(ch == ')'&&top == '(')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
