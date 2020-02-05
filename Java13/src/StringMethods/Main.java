package StringMethods;

public class Main {

	public static void main(String[] args) {
		
		String output = """ Name: %s Phone: %d Salary: $%.2f """.formatted("Pankaj", 123456789, 2000.5555);
		System.out.println(output);
		/*
		 * Name: Pankaj
		 * Phone: 123456789
		 * Salary: $2000.56
		 */


		String htmlTextBlock = "<html> \n"+
		"\t<body>\t\t \n"+
		"\t\t<p>Hello</p> \t \n"+
		"\t</body> \n"+
		"</html>";
		System.out.println(htmlTextBlock.replace(" ", "*"));
		System.out.println(htmlTextBlock.stripIndent().replace(" ", "*"));
		/*
		 * <html>*** <body> * <p>Hello</p>** * </body>* </html>
		 * <html> <body> <p>Hello</p> </body> </html> 
		 * => There is no '*', because removed white space
		 */
		
		String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";
		System.out.println(str1);
		System.out.println(str1.translateEscapes());
		/*
		 * Hi Hello' " /u0022 Pankaj 
		 * Hi Hello' " /u0022 Pankaj
		 */

	}

}
