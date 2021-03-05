package task3;

public class TestAnimals {

	public static void main(String[] args) {
		
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		d.eat();
		
		String name = c.get_name();
		System.out.println("Name: " + name);
		
		a.walk();
		
		e.eat();
		
		p.set_name("Dorothy");
		String name2 = p.get_name();
		System.out.println("Name: " + name2);		
		
		
		((Fish)a).set_name("Fishy");
		System.out.println( ((Fish)a).get_name() );
		
		((Cat)p).eat();
		
		((Cat)p).play();

		((Spider)e).walk();
		e.eat();
		((Spider)e).eat();
		
	
	}
	
}
