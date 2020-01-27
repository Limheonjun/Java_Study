package ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		
		// Stream
		Stream<String> stream = list.stream();
		stream.forEach(str->System.out.println("Stream => "+str+" : "+Thread.currentThread().getName()));
		
		// ParallelStream
		Stream<String> pstream = list.parallelStream();
		pstream.forEach(str->System.out.println("PStream => " +str+" : "+Thread.currentThread().getName()));
		
		/*
		    Stream => A : main
			Stream => B : main
			Stream => C : main
			Stream => D : main
			PStream => C : main
			PStream => D : ForkJoinPool.commonPool-worker-2
			PStream => A : ForkJoinPool.commonPool-worker-2
			PStream => B : ForkJoinPool.commonPool-worker-1
		 */

	}

}
