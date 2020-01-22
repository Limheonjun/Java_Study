package RethrowException;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	// Before Java7
	public void obscure() throws Exception {
		try {
			new FileInputStream("abc.txt").read();
			new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");
		} catch (Exception ex) {
			System.out.println("Caught exception: " + ex.getMessage());
			throw ex;
		}
	} 
	
	// After Java7
	public void precise() throws ParseException, IOException {
		try {
			new FileInputStream("abc.txt").read();
			new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");
		} catch (Exception ex) {
			System.out.println("Caught exception: " + ex.getMessage());
			throw ex;
		}
	}

}
