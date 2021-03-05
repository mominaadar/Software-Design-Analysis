package inheritance;


public abstract class Employee {
	
	//declare fields
	//declare non-abstract methods
	
	String name;
	static int age;
	char gender;
	
	abstract int computeSalary(int baseSalary, int days);

	public void set_age(int a) {
		age = a;
	}
	
	public static int get_age() {
		return age;
	}
	
	public void set_name(String n) {
		name = n;
	}
	
	public String get_name() {
		return name;
	}

	public static void main(String[] args) {
		
		BoardMember bm = new BoardMember();
		Worker wr = new Worker();
		
		
		int sal = bm.computeSalary(100,2);
		
		int sal2 = wr.computeSalary(100, 2);
		
		System.out.println(bm.get_name()+ " " + "$ " + sal);
		
		System.out.println(wr.get_name() + " " + "$ " + sal2);
	}

}