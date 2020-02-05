package EnhancedSwitchExpression;

public class Main {

	public static void main(String[] args) {		
		String day = "3";
		// Before Java13
		String str1 = switch(day) {
			case "1","2" -> "1 or 2";
			case "3","4" -> "3 or 4";
			default -> "0";
		};
		
		// After Java13
		String str2 = switch(day) {
			case "1","2" -> "1 or 2";
			case "3","4" -> "3 or 4";
			default -> {
				if(day.equals("0")) {
					yield "0";
				}
			}
		};

	}

}
