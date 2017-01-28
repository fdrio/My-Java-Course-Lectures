package fibIterative;

import java.util.Stack;

public class FibStack {

	public static void main(String[] args) {
		Stack <Integer> fibStack = new Stack<Integer>();
		int n =10;
		
		fibStack.push(1);
		fibStack.push(1); //{1,1}
		while (fibStack.size() <n){
			int x = fibStack.pop();
			int y  = fibStack.pop();
			int z = x + y;
			
			fibStack.push(y);
			fibStack.push(x);
			fibStack.push(z);
		}
		System.out.println(fibStack.peek());
	}


}
