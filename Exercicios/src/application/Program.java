package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("marta");
		list.add("Alex");
		list.add("Ana");
		list.add(2, "Renata");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		list.removeIf(x -> x.charAt(0) == 'm');
		for (String x : list) {
			System.out.println(x);
		}
	
		System.out.println("--------------------");
		System.out.println("Index of ana: " + list.indexOf("Ana"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("--------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
