package Annotation;

import java.lang.reflect.Field;
import java.util.Optional;

public class AnnotationHandler {
	private <T> T checkAnnotation(T targetObj, Class annotationObj) {
        Field[] fields = targetObj.getClass().getDeclaredFields();
        for (Field f : fields) {
            if(annotationObj == InsertData.class) {
                return checkAnnotation4InsertData(targetObj, f);
            }
//            else if(annotationObj == InsertStringData.class) {
//                return checkAnnotation4InsertString(targetObj, f);
//            }
        }
        return targetObj;
    }
	
	private <T> T checkAnnotation4InsertData(T targetObj, Field field) {
		// field에서 선언된 애노테이션을 가져옴
        InsertData annotation = field.getAnnotation(InsertData.class);
        // 애노테이션이 null이 아니거나 선언된 변수타입이 int형일 경우에만 수행
        if(annotation != null && field.getType() == int.class) {
        	// 리플렉트를 통한 private멤버에 접근허락
            field.setAccessible(true);
            // 해당 변수의 값을 애노테이션의 값으로 치환
            try {  field.set(targetObj, annotation.data()); }
            catch (IllegalAccessException e) { System.out.println(e.getMessage()); }
        }
        return targetObj;
    }
	
	public <T> Optional<T> getInstance(Class targetClass, Class annotationClass) {
        Optional optional = Optional.empty();
        Object object;
        try {
            object = targetClass.newInstance();
            object = checkAnnotation(object, annotationClass);
            optional = Optional.of(object);
        }catch (InstantiationException | IllegalAccessException e) { System.out.println(e.getMessage()); }
        return optional;
    }
}
