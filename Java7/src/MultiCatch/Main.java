
package MultiCatch;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// Before Java7
		try {

		} catch(ClassNotFoundException ex) {
			ex.printStackTrace(); 
		} catch(SQLException ex) {
			ex.printStackTrace(); 
		}
		
		// After Java7
		try {
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
	}

}
