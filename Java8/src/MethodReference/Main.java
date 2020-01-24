package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// Lambda Expression
		Consumer<String> c1 = str->System.out.println(str);
		c1.accept("This is not Static");
		// Static Method Reference
		Consumer<String> c2 = System.out::println;
		c2.accept("This is Static");
		
		
		// Lambda Expression
		Consumer<Animal> c3 = animal->animal.noise();
		c3.accept(new Animal());
		// Instance Method Reference
		Consumer<Animal> c4 = Animal::noise;
		c4.accept(new Animal());
		
		
		// Lambda Expression
		Function<Integer,Human> humanConstructor1 = age -> new Human(age);
		humanConstructor1.apply(10).show();
		// Constructor Method Reference
		Function<Integer,Human> humanConstructor2 = Human::new;
		humanConstructor2.apply(23).show();
		
		
		// Lambda Expression
		Calcul calcul = new Calcul();
		Function<Integer,Integer> ca1 = num -> calcul.doubled(num);
		System.out.println("result : " + ca1.apply(10));		
		// Outer Instance Method Reference
		Function<Integer,Integer> ca2 = calcul::doubled;
		System.out.println("result : " + ca2.apply(15));
	}
	


}
class Animal{
	String sound="¸Û¸Û";
	void noise() {
		System.out.println("sound : "+sound);
	}
}

class Human{
	int age;
	
	public Human(int age) {
		this.age = age;
	}
	void show() {
		System.out.println("I'm "+age);
	}
}

class Calcul{
	public int doubled(int x) {
		return x*x;
	}
}
