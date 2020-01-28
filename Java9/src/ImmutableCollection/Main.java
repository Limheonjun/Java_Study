package ImmutableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Before Java9
		List<String> fruits1 = new ArrayList();
		fruits1.add("Apple");
		fruits1.add("Banana");
		fruits1.add("Cherry");
		fruits1 = Collections.unmodifiableList(fruits1);
		
		fruits1.add("Lemon"); // UnsupportedOperationException

		// After Java9
		List<String> fruits2 = List.of("Apple", "Banana", "Cherry");
		fruits2.add("Lemon"); // UnsupportedOperationException

		Set<String> fruits3 = Set.of("Apple", "Banana", "Cherry", "Cherry"); // IllegalArgumentException
		
		Map<Integer, String> fruits4 = Map.of(1, "Apple", 2, "Banana", 3, "Cherry");
		Map<Integer, String> fruits5 = Map.ofEntries(Map.entry(1,"Apple"), Map.entry(2,"Banana"), Map.entry(3, "Cherry"));
	}

}
