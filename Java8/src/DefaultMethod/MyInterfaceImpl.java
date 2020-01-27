package DefaultMethod;

public class MyInterfaceImpl implements MyInterface{
	
	private int len = 10;
	
	@Override
	public int size() {
		return len;
	}
	
	// Don't need to implements default method
	
}
