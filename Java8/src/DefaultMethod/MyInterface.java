package DefaultMethod;

public interface MyInterface {
	int size();
	
	default boolean isEmpty() {
		return size()==0;
	}
}
