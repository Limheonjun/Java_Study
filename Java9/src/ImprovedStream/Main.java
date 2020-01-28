package ImprovedStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// takeWhile
		List<Integer> list1 = Stream.of(IntStream.range(1, 5).boxed().toArray(Integer[]::new))
				.takeWhile(integer -> integer < 3)
				.collect(Collectors.toList());
		list1.forEach(System.out::println);
		/*
		 * 출력결과
		 * 1
		 * 2
		 */
		
		
		
		// dropWhile
		List<Integer> list2 = Stream.of(IntStream.range(1, 5).boxed().toArray(Integer[]::new))
				.dropWhile(integer -> integer < 3)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		/*
		 * 출력결과
		 * 3
		 * 4
		 */
		
		
		
		// iterate
		List<Integer> list3 = Stream
				.iterate(1, x-> x < 11, x->x+3)
				.collect(Collectors.toList());
		list3.forEach(System.out::println);
		/*
		 * 출력결과
		 * 1
		 * 4
		 * 7
		 * 10
		 */
		
		
		
		// ofNullable
		List<Integer> list4 = Stream
				.<Integer>ofNullable(null)
				.collect(Collectors.toList());

	}

}
