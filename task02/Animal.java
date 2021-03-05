package task3;

public abstract class Animal {
	
	protected int legs;
	
	protected Animal(int l){
		this.legs = l;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("This animal walks with " + this.legs + " legs.");
	}
	
}
