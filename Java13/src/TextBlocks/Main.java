package TextBlocks;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("preview")
		String textBlock = """ Hello World """;
		System.out.println(textBlock);
		/*
		 * Hello
		 * World
		 */
		
		String str = "\nHello\nWorld";
		System.out.println(str);
		/*
		 * Hello
		 * World
		 */
		
		System.out.println("Text Block and String Literal equals() Comparison: " + (textBlock.equals(str)));
		System.out.println("Text Block and String Literal == Comparison: " + (textBlock == str));
		/*
		 * true
		 * true
		 */

		
	}

}
