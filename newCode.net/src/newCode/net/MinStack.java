package newCode.net;

import java.util.Stack;

//实现一个stack类，完成下列4个方法（牛客网题目要求）
public class MinStack {
	
	
		Stack<Integer> stack = new Stack<Integer>();
	
	   public void push(int node) {
	        stack.push(node);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	    	int [] a = new int [stack.size()];
	    	
	    	for(int i= 0 ;i < a.length;i++) {
	    		a[i] = stack.pop();
	    	}
	    	int max = a[0];
	    	for(int j = 0 ; j < a.length; j++) {
	    		max = (a[j] > max)?a[j]:max;
	    	}
	    	for(int k = a.length-1;k>=0 ;k--) {
	    		stack.push(a[k]);
	    	}
	        return max;
	    }
	    
	    //第一种方法，借用外部数组。
	    public int min() {     
	    	int [] a = new int [stack.size()];
	    	
	    	for(int i= 0 ;i < a.length;i++) {
	    		a[i] = stack.pop();
	    	}
	    	int min = a[0];
	    	for(int j = 0 ; j < a.length; j++) {
	    		min = (a[j] > min)?min:a[j];
	    	}
	    	for(int k = a.length-1;k>=0 ;k--) {
	    		stack.push(a[k]);
	    	}
	        return min;
	    }
	    
	    //第二种方法
	    public int min2(){
	    	return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack ms = new MinStack();
		ms.push(3);
		ms.push(4);
		ms.push(5);
		ms.push(2);
		System.out.println(ms.min());
		ms.pop();
		System.out.println(ms.min());
		System.out.println(ms.top());
	}

}
