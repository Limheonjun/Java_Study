package LocalVariableSyntaxforLambdaParameters;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C");
		var k = list.stream()
	    .map((var s) -> s.toLowerCase())
	    .collect(Collectors.toList());
		
		System.out.println(k);
		
		/*
		// 파라미터에 var타입을 생략 할 수 없음
		(var s1, var s2) -> s1+s2 => Error
		// 다른 타입과 var를 함께 사용할 수 없음
		(var s1, String s2) -> s1 + s2 => Error
		// 단일 매개 변수에서 람다식의 파라미터는 타입 생략 가능하지만
		s1 -> s1.toUpperCase()
		// var을 사용하는 경우엔 생략할 수 없음
		var s1 -> s1.toUpperCase() => Error
		*/

	}

}
