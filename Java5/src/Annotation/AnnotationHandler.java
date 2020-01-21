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
		// field���� ����� �ֳ����̼��� ������
        InsertData annotation = field.getAnnotation(InsertData.class);
        // �ֳ����̼��� null�� �ƴϰų� ����� ����Ÿ���� int���� ��쿡�� ����
        if(annotation != null && field.getType() == int.class) {
        	// ���÷�Ʈ�� ���� private����� �������
            field.setAccessible(true);
            // �ش� ������ ���� �ֳ����̼��� ������ ġȯ
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
