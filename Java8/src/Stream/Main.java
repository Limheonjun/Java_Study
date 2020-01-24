package Stream;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		// Not Use Stream
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenList1 = new ArrayList<>();
		for(int number : numbers){
		    if(number % 2 == 0){
		        evenList1.add(number);
		    }
		}
		System.out.println(evenList1);
		
		// Use Stream
		List<Integer> evenList2 = Stream
				.iterate(1, n -> n+1)
		        .limit(6)
		        .filter(number -> number % 2 == 0)
		        .collect(Collectors.toList());

		System.out.println(evenList2);
		
		/* Stream Lazy
		 * peek�� forEachó�� ��Ҹ� ��ȸ�ϴ� �޼ҵ�
		 * ������ s1�� ��� ���� ������ ���� ������ ��°��� ����
		 * ���� ���� �޼ҵ带 �߰����־����
		 */
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		Stream<Integer> s1 = stream1.peek(System.out::println); // ��µ��� ����
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		Stream<Integer> s2 = stream2.peek(System.out::println); 
		s2.collect(Collectors.toList()); // 1,2,3,4,5
		
		
		// �Ϲ����� ��Ʈ��
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		// �⺻�� ��Ʈ��
		IntStream intStream = IntStream.of(1,2,3,4,5);
		DoubleStream dobuleStream = DoubleStream.of(1.0,2.0,3.0,4.0,5.0);
		LongStream longStream = LongStream.of(1L,2L,3L,4L,5L);
	}

}
