package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import charactor.Hero;

/**
 * 
 * @author 377321
 *通过反射机制得到对象的方法
 *1.得到对象
 *2.得到对象构造器
 *3.然后对构造器进行实例化得到可以操作的对象
 */
public class GetObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String classname = "charactor.Hero";
		try {
			Class class1 = Class.forName(classname);
			Constructor c = class1.getConstructor();
		    Hero h1 = (Hero)c.newInstance();
		    h1.name = "teemo";
		    
		    //method2
		    Constructor[] c2 = class1.getConstructors();
		    Hero h2 = (Hero)c2[0].newInstance();
		    h2.hp = 100f;
		    System.out.println(h1.name);
		    System.out.println(h2.hp);
		    
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
