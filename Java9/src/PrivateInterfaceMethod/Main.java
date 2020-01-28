	package PrivateInterfaceMethod;

public class Main {

	public static void main(String[] args) {
		// Use Private Method
		UsePrivateMethod use = new UsePrivateMethod() {};
		use.method1();
		use.method2();
		
		// Not Use Private Method
		NotUsePrivateMethod nuse = new NotUsePrivateMethod() {};
		use.method1();
		use.method2();
		
	}

}
