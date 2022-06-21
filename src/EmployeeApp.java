import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Vikalp", 15000));
		employees.add(new Employee(102, "Kartik", 25000));
		employees.add(new Employee(103, "Devagya", 18000));

//		Comparator<Employee> comparator = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				return e1.getSalary() - e2.getSalary();
//
//			}
//		};
//		
//		Collections.sort(employees,comparator);
//		
//		System.out.println(employees);
		
		
		Collections.sort(employees,new SortByName());
		
		System.out.println("\n"+ employees);

	}

}
