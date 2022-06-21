package com.universal.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee1> employee1s = new ArrayList<Employee1>();
		employee1s.add(new Employee1("1", "vikalp", 30));
		employee1s.add(new Employee1("2", "shubham", 25));
		employee1s.add(new Employee1("3", "nisha", 28));

		List<Employee1> floats = employee1s.stream().filter(a ->a.getAge()<29).collect(Collectors.toList());
				
				
				
				
				//return a;}).collect(Collectors.toList());
				
				
			//	.map(a -> a.age).collect(Collectors.toList());

		System.out.println(floats);

	}


}
