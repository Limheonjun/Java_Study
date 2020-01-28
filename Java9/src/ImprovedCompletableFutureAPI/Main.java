package ImprovedCompletableFutureAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * - 타임아웃
		 * 다음 코드에서 doWork 함수는 sleep으로 1초가 걸리는 작업을 5번 수행하게 됨
		 * 그런데 3초가 넘게 될 때 타임아웃으로 Exception이 발생하게 되면
		 * Java 9에서는 orTimeout 함수가 추가되어서 파라미터로 넘긴 시간보다 넘게 비동기 처리를 할 때 
		 * Exception(java.util.concurrent.TimeoutException)이 나게 함
		 * 
		 */
	    int timeout = 3;    
	    CompletableFuture<String> future =
	            doWork("JavaSampleApproach")
	            .orTimeout(timeout, TimeUnit.SECONDS)
	            .whenComplete((result, error) -> {
	                if (error == null) {
	                    System.out.println("The result is: " + result);
	                } else {
	                    System.out.println("Sorry, timeout in " + timeout + " seconds.");
	                }
	            });

	    String content = future.get();
	    System.out.println("Result >> " + content);
	    
	    
	    // - 지연실행
	    long start = System.nanoTime();

	    int a = 2;
	    int b = 5;

	    CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> a + b, 
	    								// 함수명 그래로 지연이 가능한 Executor를 생성해 주는 역할
	    								// 파라미터로 특정 시간을 입력 받으면 그 시간을 지나서 동작
	                                   CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS))
	                                   .thenAccept(result -> System.out.println("result: " + result));
	    future2.get();
	    // 2초의 지연시간을 주었는데
	    // future.get()으로 수행이 완료되기까지 기다린 다음에 그 시간 차이를 출력
	    System.out.println("duration: " + TimeUnit.SECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS));
	}

	
	
	private static CompletableFuture<String> doWork(String s) {
	    return CompletableFuture.supplyAsync(() -> {
	        for (int i = 1; i <= 5; i++) {
	            try {
	                TimeUnit.SECONDS.sleep(1);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("running inside doWork()... " + i + "s");
	        }
	        return s + " out!!";
	    });
	}

}
