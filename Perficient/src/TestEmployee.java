import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		Employee john = new Employee();
		john.setId(1);
		john.setFirstName("John");
		john.setLastName("Wick");
		Employee jeff = new Employee();
		jeff.setId(2);
		jeff.setFirstName("Jeff");
		jeff.setLastName("Flake");
		jeff.setCurrentManager(1);
		Employee mike = new Employee();
		mike.setId(3);
		mike.setFirstName("Mike");
		mike.setLastName("Lloyd");
		mike.setCurrentManager(2);
		Employee don = new Employee();
		don.setId(4);
		don.setFirstName("Don");
		don.setLastName("Draper");
		don.setCurrentManager(2);
		Employee nancy = new Employee();
		nancy.setId(5);
		nancy.setFirstName("Nancy");
		nancy.setLastName("Jones");
		nancy.setCurrentManager(4);
		ArrayList<Employee> curr = new ArrayList<Employee>();
		curr.add(jeff);
		john.setCurrentReports(curr);
		ArrayList<Employee> curr1 = new ArrayList<Employee>();
		curr1.add(mike);
		curr1.add(don);
		jeff.setCurrentReports(curr1);
		ArrayList<Employee> curr2 = new ArrayList<Employee>();
		curr2.add(nancy);
		don.setCurrentReports(curr2);
		
		ArrayList<String> list = new ArrayList<String>();
		list = john.getSubordinates(john);
		System.out.println(list.toString());
	}

}
