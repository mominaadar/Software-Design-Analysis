package task3;

public class Spider extends Animal{

	Spider(){
		super(8);
	}
	
	public void eat() {
		System.out.println("Spider has " + this.legs + " legs and eats food.");
	}
	
}
