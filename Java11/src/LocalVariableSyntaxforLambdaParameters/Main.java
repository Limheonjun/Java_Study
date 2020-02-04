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
		// �Ķ���Ϳ� varŸ���� ���� �� �� ����
		(var s1, var s2) -> s1+s2 => Error
		// �ٸ� Ÿ�԰� var�� �Բ� ����� �� ����
		(var s1, String s2) -> s1 + s2 => Error
		// ���� �Ű� �������� ���ٽ��� �Ķ���ʹ� Ÿ�� ���� ����������
		s1 -> s1.toUpperCase()
		// var�� ����ϴ� ��쿣 ������ �� ����
		var s1 -> s1.toUpperCase() => Error
		*/

	}

}
