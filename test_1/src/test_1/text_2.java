package test_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class text_2 {
	public static void main(String[] args) throws Exception{
			text t = new text();
		
			Class<?> cls = Class.forName("test_1.text");//�ַ�����ͨ���ļ����и���
			Class<?> cls_1 = text.class;
			Class<?> cls_2 = t.getClass();
			
			
			Object object = cls.newInstance();
			Constructor<?>constructor = cls.getDeclaredConstructor(int.class);
			constructor.setAccessible(true);//����Ȩ��
			object = constructor.newInstance(300);
			Field f = cls.getField("sum");
			f.getType();
			f.set(object, 200);//oΪ����ʵ��
			Method method = cls.getMethod("add");
			
			method.invoke(object);
			
			method  = cls.getMethod("show", null);
			method.invoke(object);
			//ֻд�������� ��������
			//�������ڸ���
		
		
		
	}
}
