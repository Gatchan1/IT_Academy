package n2exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] namesArray = {"Alex","Ada","Rigoberto","Andrea","Ana","Leticia","Fernando"};
		List<String> names = Arrays.asList(namesArray);
		
		List<String> newNames = filterAThreeLetters(names);

		newNames.forEach(System.out::println);
	}
	
	private static List<String> filterAThreeLetters (List<String> str) {
		return str.stream()
				.filter(s -> s.charAt(0) == 'A' && s.length() == 3)
				.toList();
	}

}
