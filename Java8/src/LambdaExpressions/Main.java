package LambdaExpressions;

public class Main {
	// Before Java8
	Runnable r1 = new Runnable() {
		public void run() {
			System.out.println("Hello");
		}
	};
	
	// After Java8
	Runnable r2 = () -> {
		System.out.println("Hello");
	};
}
