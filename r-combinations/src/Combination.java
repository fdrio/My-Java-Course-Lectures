
public class Combination {
	public static void main(String args[]){
		long rComb = nChooseK(10,6);
		System.out.println(rComb);
	}
	public static long nChooseK(long n, long k){
		if((n == k)|| k==0){
			return 1;
		}
		else return (nChooseK((n-1), (k-1))+ nChooseK((n-1),(k)));
	}

}
