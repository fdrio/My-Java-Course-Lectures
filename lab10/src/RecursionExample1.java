public class RecursionExample1 {
	
	public static void main(String[] args ) {
			m1(1); // Line 0
	}
	private static void m1( int n ) {
			if (n >0) {
					m1(n-1); // Line 1
					System. out .println( n );
					m1(n- 1); // Line 2
			}
	}
}
