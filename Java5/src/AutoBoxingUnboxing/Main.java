package AutoBoxingUnboxing;

public class Main {

	public static void main(String[] args) {
		// Boxing
		Integer i1 = new Integer(30);
		System.out.println("Boxing : "+i1);
		
		// Unboxing
		int i2 = i1.intValue();
		System.out.println("Unboxing : "+i2);
		
		// AutoBoxing
		Integer i3 = 25;
		System.out.println("AutoBoxing : "+i3);
		
		// AutoUnboxing
		int i4 = i3;
		System.out.println("AutoUnboxing : "+i4);
	}

}
