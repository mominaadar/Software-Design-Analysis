package task3;

public class Fish extends Animal{

	String fishName;
	
	Fish(){
		super(0);
	}
	
	public void walk() {
		System.out.println("Fish can't walk.");
	}
	
	public void eat() {
		System.out.println("Fish eat food.");
	}
	
	public void play() {
		System.out.println("Fish can play.");
	}
	
	public String get_name() {
		return this.fishName;
	}
	
	public void set_name(String n) {
		this.fishName = n;
	}
	
}
