package inheritance;

public class AddressBook{

	
	public void displaySalary(int baseSalary, int days) {
		
		Employee[] entry = new Employee[5];		
		
		entry[0].set_name("john");
		entry[0].set_age(30);
		entry[1].set_name("will");
		entry[1].set_age(35);
		entry[2].set_name("mary");
		entry[2].set_age(25);
		entry[3].set_name("smith");
		entry[3].set_age(29);
		entry[4].set_name("chloe");
		entry[4].set_age(38);
		
		for (int x = 0; x< 5; x++) {
				
			System.out.println( "Name: " + entry[x].get_name() + "Salary: " + entry[x].computeSalary(100,  2));
		
		}
	}
	
	/*public static void main(String[] args) {
		
		AddressBook obj = new AddressBook();
		
		obj.displaySalary(150,3);
					
	}*/

}
