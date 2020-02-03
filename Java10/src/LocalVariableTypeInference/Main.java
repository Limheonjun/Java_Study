package LocalVariableTypeInference;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		var message2 = "World";
		System.out.println(message2 instanceof String);	// true
		
		
		// 선언과 초기화를 동시에 할때만 가능
		var numbers1 = List.of(1, 2, 3, 4, 5); 
//		var numbers2;
//		numbers2 = List.of(1, 2, 3, 4, 5); // Error
		
		// 반복문에서 지역변수 선언할때 사용 가능
		for (var i = 0; i < numbers1.size(); i++) { System.out.println(numbers1.get(i)); }

		// <>안이 비어있으면 <Object>로 설정
		var typeInference = new ArrayList<>();
		System.out.println(typeInference.getClass().getName());
		
	}

}
