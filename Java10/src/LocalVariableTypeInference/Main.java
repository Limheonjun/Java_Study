package LocalVariableTypeInference;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		var message2 = "World";
		System.out.println(message2 instanceof String);	// true
		
		
		// ����� �ʱ�ȭ�� ���ÿ� �Ҷ��� ����
		var numbers1 = List.of(1, 2, 3, 4, 5); 
//		var numbers2;
//		numbers2 = List.of(1, 2, 3, 4, 5); // Error
		
		// �ݺ������� �������� �����Ҷ� ��� ����
		for (var i = 0; i < numbers1.size(); i++) { System.out.println(numbers1.get(i)); }

		// <>���� ��������� <Object>�� ����
		var typeInference = new ArrayList<>();
		System.out.println(typeInference.getClass().getName());
		
	}

}
