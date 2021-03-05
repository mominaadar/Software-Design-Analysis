package task3;

public class Cat extends Animal implements Pet{
	
	String catName;
	
	Cat(String n){
		super(4);
		this.catName = n;
	}

	Cat(){
		this("");
	}
	
	public String get_name() {
		return this.catName;
	}
	
	public void set_name(String n) {
		this.catName = n;
	}
	
	public void play() {
		System.out.println("Cat is playing.");
	}
	
	public void eat() {
		System.out.println("Cat is eating.");
	}
	
}
