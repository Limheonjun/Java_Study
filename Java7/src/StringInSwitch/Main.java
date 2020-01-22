package StringInSwitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String color = sc.next();
		
		switch(color) {
			case "YELLO":{
				System.out.println("This is Yello");
				break;
			}
			case "RED":{
				System.out.println("This is RED");
				break;
			}
			case "BLUE":{
				System.out.println("This is BLUE");
				break;
			}
		}

	}

}
