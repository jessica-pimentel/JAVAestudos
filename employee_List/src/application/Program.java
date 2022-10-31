package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>(); 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employee will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
			if (pos == null) {
				System.out.println("This ID does not exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				list.get(pos).increaseSalary(percent);
			}
			
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}

	public static Integer position (List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
				
			}
		}
		return null;
	}
	
}
