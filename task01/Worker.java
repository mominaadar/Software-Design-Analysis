package inheritance;

public class Worker extends Employee{
	
	public int computeSalary(int baseSalary, int days) {
		
		set_age(10);
		set_name("Will");
		
		int salary = baseSalary + days*45 + get_age()*50;
		
		return salary;
		
	}
	
}
