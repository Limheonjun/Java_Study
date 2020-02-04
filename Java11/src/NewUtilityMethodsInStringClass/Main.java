package NewUtilityMethodsInStringClass;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// �� ���ڿ��̳� ������ �ִ� ��� true ��ȯ
		System.out.println(" ".isBlank()); // true
		System.out.println("k".isBlank()); // false
		
		// ���꽺Ʈ���� ������ �������� ��ȯ
		String str1 = "JD\nJD\nJD"; 
        System.out.println(str1);
        /*
         * JD
         * JD
         * JD
         */
        System.out.println(
        		str1
        		.lines()
        		.collect(Collectors.toList())
        ); // [JD, JD, JD]
        
        // ���ڿ��� ���� ó��
        String str2 = " JD "; 
        System.out.print("Start");
        System.out.print(str2.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str2.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str2.stripTrailing());
        System.out.println("End");
        /*
        StartJDEnd
        StartJD End
        Start JDEnd
        */
        
        // ���ڿ� �ݺ�
        String str = "=".repeat(5);
        System.out.println(str); 
        //=====

	}

}
