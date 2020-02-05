package SwtichExpressions;

public class Main {

	public static void main(String[] args) {
		// Before Java12
		String str1;
		String day1 = "1";
		switch(day1) {
		case "1":
		case "2":
			str1 = "1 or 2";
			break;
		case "3":
		case "4":
			str1 = "3 or 4";
			break;
		default:
			str1 = "0";
		}
		System.out.println(str1);
		
		// After Java12
		String day2 = "3";
		String str2 = switch(day2) {
			case "1","2" -> "1 or 2";
			case "3","4" -> "3 or 4";
			default -> "0";
		};
		System.out.println(str2);
	}

}
