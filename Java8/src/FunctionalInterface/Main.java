package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// Runnable
		Runnable r = ()->System.out.println("Hello");
		r.run(); // Hello
		
		// Supplier<T>
		Supplier<String> s = ()->"supplier";
		String result = s.get();
		System.out.println("result : "+result); // result : supplier
		
		// Consumer(doesn't work)
		//Consumer<String> c = (str)->System.out.println("result : "+str);
		//c.accept("consumer");
		
		// Function
		Function<String, Integer> f = str->Integer.parseInt(str);
		System.out.println("result : "+f.apply("1")); // result : 1
		
		// Predicate
		Predicate<String> p = str->str.isEmpty();
		System.out.println("result : "+(p.test("abc")?"true":"false")); // result : false
		
		// UnaryOperator
		UnaryOperator<Integer> u = num -> num+3;
		System.out.println("result : "+u.apply(3)); // result : 6
		
		// BinaryOperator
		BinaryOperator<String> bo = (str1,str2) -> str1+" vs "+str2;
		System.out.println("result : "+bo.apply("Tiger", "Lion")); // result : Tiger vs Lion
		
		// BiPredicate
		BiPredicate<String,Integer> bp = (str, num) -> str.equals(Integer.toString(num));
		System.out.println("result : "+(bp.test("1", 1)?"true":"false")); // result : true
		
		// BiComsumer
		BiConsumer<String,Integer> bc = (str, num) -> System.out.println(str+" :: "+num);
		bc.accept("3", 5); // 3 :: 5
		
		// BiFunction
		BiFunction<String,Integer,String> bf = (str,num) -> str+num;
		System.out.println("result : "+bf.apply("2", 3)); // result : 23
		
		// Comparator
		Comparator<String> c = (str1, str2) -> str1.compareTo(str2);
		System.out.println("result : "+c.compare("aaa", "bbb")); // result : -1
		

	}

}
