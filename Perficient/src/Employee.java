import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	
	private int currentManager;
	private ArrayList<Employee> currentReports;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCurrentManager() {
		return currentManager;
	}
	public void setCurrentManager(int currentManager) {
		this.currentManager = currentManager;
	}
	public ArrayList<Employee> getCurrentReports() {
		return currentReports;
	}
	public void setCurrentReports(ArrayList<Employee> currentReports) {
		this.currentReports = currentReports;
	}
	
	public ArrayList<String> getSubordinates(Employee name) {
		ArrayList<Employee> listOfSubordinates = new ArrayList<Employee>();
		listOfSubordinates.addAll(iterateSubordinates(name));
		Set<Employee> getList = new HashSet<Employee>();
		getList.addAll(listOfSubordinates);

		ArrayList<String> target = new ArrayList<String>();
		for (Employee sub : listOfSubordinates) {
			target.add(sub.firstName + " " + sub.lastName);
		}
		
		return target;
	}

	public ArrayList<Employee> iterateSubordinates(Employee target) {		
		ArrayList<Employee> targetList = new ArrayList<Employee>();
		ArrayList<Employee> targetList1 = new ArrayList<Employee>();
		if (target.getCurrentReports() != null && target.getCurrentReports().size() > 0) {
			targetList1.addAll(target.getCurrentReports());
			targetList.addAll(targetList1);
			for (Employee sub : targetList) {
				targetList1.add(sub);
				if (sub.getCurrentReports() != null && sub.getCurrentReports().size() > 0) {
					targetList1.addAll(iterateSubordinates(sub));
				}
			}
			Map<Employee, Integer> getList = new HashMap<Employee, Integer>();
			for (Employee i : targetList1) {
				getList.put(i, i.getId());
			}
		    for (Map.Entry<Employee, Integer> entry : getList.entrySet()) {
		    	if (!targetList.contains(entry.getKey())) {		    	
					targetList.add(entry.getKey());
		    	}
			}
		}
		return targetList;
	}
}
