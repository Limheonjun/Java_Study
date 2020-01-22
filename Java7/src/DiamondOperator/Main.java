package DiamondOperator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Before Java7
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<Integer> primes1 = new ArrayList<Integer>();
		
		// After Java7
		Map<String, List<String>> map2 = new HashMap<>();
		List<Integer> primes2 = new ArrayList<>();

	}

}
