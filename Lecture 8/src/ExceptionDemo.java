import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		a(5);

	}
	public static void a(int x){
		b(6);
	}
	public static void b (int x){
		try{
			c(7);
			return;
		}
		catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException();
			//System.out.println("IOExcpetion detected");
		}
		catch(RuntimeException e){
			System.out.println("Exception detected");
		}
		System.out.println("After Exception");
	}
	public static void c(int x ) throws IOException{
		
			throw new IOException();
		
		
	}

}
