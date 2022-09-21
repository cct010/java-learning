import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-21
 * Time: 20:44
 */
public class Test {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(-1);
        stack.push(8);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }
}
class MinStack{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        if(!minStack.empty()){
            int top = minStack.peek();
            if(top>=val){
                minStack.push(val);
            }
        }
        else {
            minStack.push(val);
        }
    }
    public void pop(){
        int popVal = stack.pop();
        if(!minStack.empty()){
            int top = minStack.peek();
            if(top == popVal){
                minStack.pop();
            }
        }
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return  minStack.peek();
    }
}