package NumericLiterals;

public class Main {

	public static void main(String[] args) {
		int num10 = 16;
		int num2 = 0b10000;
		int num8 = 020;
		int num16 = 0X10;
		
		// 출력결과 : 16
		System.out.println("num10 : "+num10);
		System.out.println("num2 : "+num2);
		System.out.println("num8 : "+num8);
		System.out.println("num16 : "+num16);
		
		
		int milion = 1_0000_0000;
		
		// 출력결과 : 10000000
		System.out.println("1억 : "+milion);

	}

}
