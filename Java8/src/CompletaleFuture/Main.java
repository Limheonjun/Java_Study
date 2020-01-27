package CompletaleFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		// Future 인터페이스 사용
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<Double> future1 = executorService.submit(()-> {
		    Thread.sleep(2000);
		    return 1000.0;
		});
		 
		System.out.println("비동기 처리를 하는 동안 다른 일처리.");
		 
		try {
		    System.out.println("결과 : " + future1.get(3000, TimeUnit.MILLISECONDS)); // 타임아웃 3초
		} catch (Exception e) {
		    e.printStackTrace();
		}
		 
		// 출력 결과
		// 비동기 처리를 하는 동안 다른 일처리.
		// 결과 : 1000.0

		
		// CompletableFuture 인터페이스 사용 기본 예제
		Future<Double> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e){
                e.printStackTrace();
            }
 
            return 1000.0;
        });
 
		System.out.println("비동기 처리를 하는 동안 다른 일처리.");
		 
		try {
		    System.out.println("결과 : " + future2.get(3000, TimeUnit.MILLISECONDS)); // 타임아웃 3초
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		// 다수의 비동기 처리방식 첫번째	
		Supplier<Double> supplier = () -> {
		    try {
		        Thread.sleep(2000);
		    } catch (Exception e){
		        e.printStackTrace();
		    }
		 
		    return 1000.0;
		};


		List<Supplier<Double>> supplierList1 = Arrays.asList(supplier, supplier, supplier, supplier);
		 
		// 1. 병렬 스트림을 이용. 각 태스크를 병렬로 하여 성능을 높이자. => 2번에 비해 좀 더 간단해 보임
		supplierList1.parallelStream().
		    map(Supplier::get).
		    reduce(Double::sum).
		    ifPresent(System.out::println);
		 
		// 2. CompletableFuture 를 이용한 비동기적으로 처리
		{
		    List<CompletableFuture<Double>> completableFutures = supplierList1.stream().
		            map(CompletableFuture::supplyAsync).
		            collect(Collectors.toList());
		 
		    // join 메소드는 모든 비동기 동작이 끝나길 기다립니다.
		    completableFutures.stream().
		            map(CompletableFuture::join).
		            reduce(Double::sum).
		            ifPresent(System.out::println);
		}
		

		
		// 다수의 비동기 처리방식 두번째
		List<Supplier<Double>> supplierList2 = IntStream.range(0, 100).mapToObj(n -> supplier).collect(Collectors.toList());
		 
		// 1. 병렬 스트림을 이용. 각 태스크를 병렬로 하여 성능을 높이자.
		supplierList2.parallelStream().
		        map(Supplier::get).
		        reduce(Double::sum).
		        ifPresent(System.out::println);
		 
		// 2. CompletableFuture 를 이용한 비동기적으로 처리
		{
		 
		    final Executor executor = Executors.newFixedThreadPool(Math.min(supplierList2.size(), 100), r -> {
		                Thread t = new Thread(r);
		                // 데몬 스레드 정의
		                // 일반 스레드가 실행 중일 때 자바 프로그램은 종료되지 않음 -> 어떤 이벤트를 한없이 기다리면서 종료되지 않은 일반 자바 스레드가 있으면 문제
		                // 데몬 스레드는 자바 프로그램이 종료될 때 종료
		                t.setDaemon(true);
		                return t;
		            });
		 
		    List<CompletableFuture<Double>> completableFutures = supplierList2.stream().
		            map(CompletableFuture::supplyAsync).
		            collect(Collectors.toList());
		 
		    // join 메소드는 모든 비동기 동작이 끝나길 기다립니다.
		    completableFutures.stream().
		            map(CompletableFuture::join).
		            reduce(Double::sum).
		            ifPresent(System.out::println);
		}
		 
		// 병렬스트림 걸린 시간 : 26066초
		// CompletableFuture 사용 걸린 시간 : 2015초


	}

}
