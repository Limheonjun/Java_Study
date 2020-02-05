package PatternMatchingForInstanceof;

public class Main {

	public static void main(String[] args) {
		
		String obj = "";
		// Before Java12
		if(obj instanceof String) {
			String s = (String) obj;
		}
		
		// After Java12
		if(obj instanceof String s) {
			
		}
		
	}

}
