package AutomaticResouceManagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// Before Java7
		BufferedReader br1 = new BufferedReader(new FileReader("test.txt"));
		try {
			br1.readLine();
		} finally {
			if(br1 != null) br1.close();
		}
		
		// After Java7
		try(BufferedReader br2 = new BufferedReader(new FileReader("test.txt"))) {
			br2.readLine();
		}

	}

}
