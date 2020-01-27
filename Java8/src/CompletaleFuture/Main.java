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
		
		// Future �������̽� ���
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<Double> future1 = executorService.submit(()-> {
		    Thread.sleep(2000);
		    return 1000.0;
		});
		 
		System.out.println("�񵿱� ó���� �ϴ� ���� �ٸ� ��ó��.");
		 
		try {
		    System.out.println("��� : " + future1.get(3000, TimeUnit.MILLISECONDS)); // Ÿ�Ӿƿ� 3��
		} catch (Exception e) {
		    e.printStackTrace();
		}
		 
		// ��� ���
		// �񵿱� ó���� �ϴ� ���� �ٸ� ��ó��.
		// ��� : 1000.0

		
		// CompletableFuture �������̽� ��� �⺻ ����
		Future<Double> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e){
                e.printStackTrace();
            }
 
            return 1000.0;
        });
 
		System.out.println("�񵿱� ó���� �ϴ� ���� �ٸ� ��ó��.");
		 
		try {
		    System.out.println("��� : " + future2.get(3000, TimeUnit.MILLISECONDS)); // Ÿ�Ӿƿ� 3��
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		// �ټ��� �񵿱� ó����� ù��°	
		Supplier<Double> supplier = () -> {
		    try {
		        Thread.sleep(2000);
		    } catch (Exception e){
		        e.printStackTrace();
		    }
		 
		    return 1000.0;
		};


		List<Supplier<Double>> supplierList1 = Arrays.asList(supplier, supplier, supplier, supplier);
		 
		// 1. ���� ��Ʈ���� �̿�. �� �½�ũ�� ���ķ� �Ͽ� ������ ������. => 2���� ���� �� �� ������ ����
		supplierList1.parallelStream().
		    map(Supplier::get).
		    reduce(Double::sum).
		    ifPresent(System.out::println);
		 
		// 2. CompletableFuture �� �̿��� �񵿱������� ó��
		{
		    List<CompletableFuture<Double>> completableFutures = supplierList1.stream().
		            map(CompletableFuture::supplyAsync).
		            collect(Collectors.toList());
		 
		    // join �޼ҵ�� ��� �񵿱� ������ ������ ��ٸ��ϴ�.
		    completableFutures.stream().
		            map(CompletableFuture::join).
		            reduce(Double::sum).
		            ifPresent(System.out::println);
		}
		

		
		// �ټ��� �񵿱� ó����� �ι�°
		List<Supplier<Double>> supplierList2 = IntStream.range(0, 100).mapToObj(n -> supplier).collect(Collectors.toList());
		 
		// 1. ���� ��Ʈ���� �̿�. �� �½�ũ�� ���ķ� �Ͽ� ������ ������.
		supplierList2.parallelStream().
		        map(Supplier::get).
		        reduce(Double::sum).
		        ifPresent(System.out::println);
		 
		// 2. CompletableFuture �� �̿��� �񵿱������� ó��
		{
		 
		    final Executor executor = Executors.newFixedThreadPool(Math.min(supplierList2.size(), 100), r -> {
		                Thread t = new Thread(r);
		                // ���� ������ ����
		                // �Ϲ� �����尡 ���� ���� �� �ڹ� ���α׷��� ������� ���� -> � �̺�Ʈ�� �Ѿ��� ��ٸ��鼭 ������� ���� �Ϲ� �ڹ� �����尡 ������ ����
		                // ���� ������� �ڹ� ���α׷��� ����� �� ����
		                t.setDaemon(true);
		                return t;
		            });
		 
		    List<CompletableFuture<Double>> completableFutures = supplierList2.stream().
		            map(CompletableFuture::supplyAsync).
		            collect(Collectors.toList());
		 
		    // join �޼ҵ�� ��� �񵿱� ������ ������ ��ٸ��ϴ�.
		    completableFutures.stream().
		            map(CompletableFuture::join).
		            reduce(Double::sum).
		            ifPresent(System.out::println);
		}
		 
		// ���Ľ�Ʈ�� �ɸ� �ð� : 26066��
		// CompletableFuture ��� �ɸ� �ð� : 2015��


	}

}
