import java.util.Scanner;
public class Fibonacci {
		public static long fibMemo []= new long [100];
		
	  public static long fibonacci(long number) {
		    if ((number == 0) || (number == 1)){ // base cases
		      return number;}
	    else if (fibMemo[(int) number] != 0){
				return fibMemo[(int)number];}		    	
		    
		      // recursion step
		    else {
		    	long fib = fibonacci(number - 1) + fibonacci(number - 2);
		    	fibMemo[(int)number]= fib;
		    	return fib;
		    // comment
		    }
		    
	  }
	  public static int gcd(int d, int r){
		 if (r!=0) return gcd (r, d%r);
		 else return d;
	  }
		  

		  public static void main(String[] args) {
			  
//		    for (int counter = 0; counter < 100; counter++)
//		      System.out.println( counter+" is "+ fibonacci(counter));
		    System.out.println(gcd(120,100));
		  }
		}