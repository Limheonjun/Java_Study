package Enumeration;

public class Main {

	public static void main(String[] args) {
		System.out.println("BLACK : " + Color.BLACK);
		// BLACK : BLACK
		
		System.out.print("Color : ");
		for(Color color : Color.values()) {
			System.out.print(color+" ");
		}
		System.out.println();
		// Color : RED WHITE YELLO BLUE BLACK GREEN 
		
		
		System.out.print("Number : ");
		for(Number num : Number.values()) {
			System.out.print(num+" ");
		}
		System.out.println();
		// Number : ONE TWO THREE FOUR FIVE SIX SEVEN 
		
		
		Color c = Color.valueOf("RED");
		System.out.println(c);
		// RED
	}

}

enum Color {
	RED(2), WHITE(4), YELLO(6), BLUE(8), BLACK(10), GREEN(12);
	
	private final int value;
	Color(int value) {this.value = value;}
	public int getValue() {return value;}
}

enum Number {
	ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;
}