package ImprovedCompletableFutureAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * - Ÿ�Ӿƿ�
		 * ���� �ڵ忡�� doWork �Լ��� sleep���� 1�ʰ� �ɸ��� �۾��� 5�� �����ϰ� ��
		 * �׷��� 3�ʰ� �Ѱ� �� �� Ÿ�Ӿƿ����� Exception�� �߻��ϰ� �Ǹ�
		 * Java 9������ orTimeout �Լ��� �߰��Ǿ �Ķ���ͷ� �ѱ� �ð����� �Ѱ� �񵿱� ó���� �� �� 
		 * Exception(java.util.concurrent.TimeoutException)�� ���� ��
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
	    
	    
	    // - ��������
	    long start = System.nanoTime();

	    int a = 2;
	    int b = 5;

	    CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> a + b, 
	    								// �Լ��� �׷��� ������ ������ Executor�� ������ �ִ� ����
	    								// �Ķ���ͷ� Ư�� �ð��� �Է� ������ �� �ð��� ������ ����
	                                   CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS))
	                                   .thenAccept(result -> System.out.println("result: " + result));
	    future2.get();
	    // 2���� �����ð��� �־��µ�
	    // future.get()���� ������ �Ϸ�Ǳ���� ��ٸ� ������ �� �ð� ���̸� ���
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
