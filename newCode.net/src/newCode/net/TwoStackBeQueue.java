package newCode.net;
import java.util.Stack;


class Squeue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
      stack1.add(node);
    }
    
    public int pop() {
    	
    	int num  = 0;
    	int pre = 0;
    	while ( !stack1.isEmpty() ) {
    		pre = stack1.pop();
    		stack2.add(pre);
    	}
    	num = stack2.pop();
    	while (!stack2.isEmpty()) {
    		pre = stack2.pop();
    		stack1.add(pre);
    	}
    	System.out.println(num);
    	return num;
    }
}

public class TwoStackBeQueue {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squeue que = new Squeue();
		que.push(1);
		que.push(2);
		que.push(3);
		que.push(4);
		que.push(5);
		que.pop();
		que.pop();
	}

}

