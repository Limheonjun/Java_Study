package PrivateInterfaceMethod;

public interface UsePrivateMethod {
	default void method1() {
		printLines();
		System.out.println("This is method1");
	}
	
	default void method2() {
		printLines();
		System.out.println("This is method2");
	}
	
	private void printLines() {
		System.out.println("Starting method");
		System.out.println("Doing someting");
	}
}
