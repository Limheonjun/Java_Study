package PrivateInterfaceMethod;

public interface NotUsePrivateMethod {
	default void method1() {
		System.out.println("Starting method");
		System.out.println("Doing someting");
		System.out.println("This is method1");
	}
	
	default void method2() {
		System.out.println("Starting method");
		System.out.println("Doing someting");
		System.out.println("This is method2");
	}
}
