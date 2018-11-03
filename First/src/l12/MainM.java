package l12;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainM {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {

		// Class clazz = Cat.class;
		Cat cat = new Cat("Susleg");
		Class clazz = cat.getClass();
		int mod = clazz.getModifiers();
		if (Modifier.isPublic(mod)) {
			System.out.println("Class is public");
		}
		if (Modifier.isPrivate(mod)) {
			System.out.println("Class is private");
		}
		System.out.println(clazz.getSuperclass());

		Class[] interfaces = clazz.getInterfaces();
		for (Class myInterface : interfaces) {
			System.out.println(myInterface.getName());
		}

		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
			System.out.println(field.getType());
		}

		Field f = clazz.getField("color");
		String color = (String) f.get(cat);
		f.set(cat, "RED");
		color = (String) f.get(cat);
		System.out.println(color);

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			for (Class parameter : method.getParameterTypes()) {
				System.out.println(parameter.getName());
			}
		}

		Class cc = Class.forName("less12.Cat");
		Cat cat1 = (Cat) cc.newInstance();
		System.out.println(cat1.color);

		Field f2 = clazz.getDeclaredField("skin");
		f2.setAccessible(true);
		String skin = (String) f2.get(cat);
		f2.set(cat, "Wood");
		skin = (String) f2.get(cat);
		System.out.println(skin);
		
		Method method =clazz.getDeclaredMethod("getSomething");
		method.setAccessible(true);
		method.invoke(cat);
		
		method =clazz.getMethod("setSomething",String.class,int.class);
		method.invoke(cat,"!!!",666);
		
		System.out.println(method.getAnnotation(MyAnno.class).str());
		System.out.println(method.getAnnotation(MyAnno.class).val());
		
	}

}
