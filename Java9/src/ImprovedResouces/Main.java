package ImprovedResouces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Java7
		BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        try (BufferedReader reader2 = reader) {
            System.out.println(reader2.readLine());
        }
        
        // Java9
        BufferedReader reader3 = new BufferedReader(new FileReader("example.txt"));
        try (reader3) {
            System.out.println(reader3.readLine());
        }

	}

}
