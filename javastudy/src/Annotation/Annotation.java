package Annotation;

import java.lang.reflect.Field;

public class Annotation {
	public static void getinfo(Class<?>clazz) throws InstantiationException, IllegalAccessException{
		Man man=(Man) clazz.newInstance();
		Field []fields=clazz.getDeclaredFields();
		for (Field field : fields) {
			if(field.isAnnotationPresent(Value.class));
			Value value=field.getAnnotation(Value.class);
			
			
			
			
		}
		
	}

}
