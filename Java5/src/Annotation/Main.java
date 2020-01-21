package Annotation;

public class Main {

	public static void main(String[] args) {
		AnnotationHandler handler = new AnnotationHandler();
        Annotation a = handler.getInstance(Annotation.class, InsertData.class)
                .map(o -> (Annotation)o)
                .orElse(new Annotation());

		System.out.println("getI : "+a.getI());

	}

}
