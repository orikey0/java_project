package test_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class text_2 {
	public static void main(String[] args) throws Exception{
			text t = new text();
		
			Class<?> cls = Class.forName("test_1.text");//字符串，通过文件进行更改
			Class<?> cls_1 = text.class;
			Class<?> cls_2 = t.getClass();
			
			
			Object object = cls.newInstance();
			Constructor<?>constructor = cls.getDeclaredConstructor(int.class);
			constructor.setAccessible(true);//忽略权限
			object = constructor.newInstance(300);
			Field f = cls.getField("sum");
			f.getType();
			f.set(object, 200);//o为对象实例
			Method method = cls.getMethod("add");
			
			method.invoke(object);
			
			method  = cls.getMethod("show", null);
			method.invoke(object);
			//只写了类名字 方法名字
			//核心在于复用
		
		
		
	}
}
