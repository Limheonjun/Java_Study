package DefaultMethod;

public class Main {

	public static void main(String[] args) {

		MyInterface myInterfaceImpl = new MyInterfaceImpl();
		System.out.println(myInterfaceImpl.size());
		System.out.println(myInterfaceImpl.isEmpty()); // ������ ���� �ʾƵ� ��� ����
	}

}
