package inheritance;

public class BoardMember extends Employee{

	public int computeSalary(int baseSalary, int days) {
		
		set_age(10);
		set_name("John");
		
		int salary = baseSalary + days*35 + get_age()*100;
		
		return salary;
	}
	
}
