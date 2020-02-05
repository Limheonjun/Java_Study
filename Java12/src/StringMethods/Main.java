package StringMethods;

public class Main {

	public static void main(String[] args) {
		
		String str = "1000";
		System.out.println(str.indent(5)); // 출력 : "     1000"
		System.out.println(str.transform(Integer::parseInt)); // 출력 : 1000
		
		
	}

}
