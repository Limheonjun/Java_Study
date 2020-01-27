package Optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		String str1 = null;
		String str2 = "Not";
		
		// Before Java8
		if(str2 != null) System.out.println(str2);
		
		// After Java8
		Optional.of(str2)
		.ifPresent(System.out::println);
		
		
	}

}
