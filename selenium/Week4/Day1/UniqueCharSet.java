package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharSet {

	public static void main(String[] args) {
		
		String name = "Google";
		name=name.toLowerCase();		
		char[] ch = name.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		
		for (char eachchar : ch) {
			set.add(eachchar);
		}
		
		System.out.println(set);
		
		String output = "";
		for (char each : set) {
			output=output+each;
		}
		System.out.println(output);
	}
}
