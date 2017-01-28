
public class Fibonacci {

	public static void main(String[] args) {
		long y = fibonacci(10);
		long z = fib(10);
		
		System.out.println(y);
		System.out.println(z);
		System.out.println("hello"+'c');
	}
	
	public static long fibonacci(long number){
		int previous = 0;
		int current = 0;
		int next = 1;
		for (int i = 0; i< number; i++){
			previous  = current ;
			current = next;
			next = current + previous;
		}
		return current;
	}
	public static long fib(long number){
		if (number == 0){return number;}
		else if (number == 1 || number == 2){return 1;}
		else 
		return fib(number -1)+ fib(number -2);
	}
	
	public static boolean isMember(int value, int[] set){
			for(int element: set){
				if(value==element)
						return true;
			}
			return false;
	}

}
