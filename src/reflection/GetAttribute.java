package reflection;
/**
 * 通过反射机制获取属性
 */
import java.lang.reflect.Field;

import charactor.Hero;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero h = new Hero();
		try {
			Field name = h.getClass().getDeclaredField("name");
			name.set(h, "mouBI");
			System.out.println(h.name);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
