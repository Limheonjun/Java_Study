package ImprovedDiamondOperator;

public class Main {

	public static void main(String[] args) {
		// Java9
		MyClass<Integer> obj = new MyClass<>() {  
            Integer add(Integer x, Integer y) {  
                return x+y;   
            }  
        };    
        Integer sum = obj.add(100,101);  
        System.out.println(sum); // In Java7 => Error
        
  

	}

}

abstract class MyClass<T>{
	abstract T add(T num, T num2);
}