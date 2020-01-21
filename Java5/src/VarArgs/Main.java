package VarArgs;

public class Main {

	public static void main(String[] args) {
		show("This", "is", "Hello");
		show("This", "is", "Hello", "World");
	}
	
	public static void show(String... str) {
		System.out.print("str : ");
		for(String s : str) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
