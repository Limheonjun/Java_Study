package NewUtilityMethodsInStringClass;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// 빈 문자열이나 공백이 있는 경우 true 반환
		System.out.println(" ".isBlank()); // true
		System.out.println("k".isBlank()); // false
		
		// 서브스트링을 행으로 나눈것을 반환
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
        
        // 문자열의 공백 처리
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
        
        // 문자열 반복
        String str = "=".repeat(5);
        System.out.println(str); 
        //=====

	}

}
