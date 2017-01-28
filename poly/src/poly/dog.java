package poly;

public class dog extends animal {
	public int[] array = {1,2,3};
	
	
	@Override
	public void printSound() {
		// TODO Auto-generated method stub
		System.out.println("Wooof, woof!");
	}
	public void walk(){
		System.out.println("I am a dog and I am walking!");
	}

}
