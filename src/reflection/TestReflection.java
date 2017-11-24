package reflection;

import charactor.Hero;

public class TestReflection {

	static String classname = "charactor.Hero";
	/**
	 * 通过3个方法得到对象
	 * 1.
	 */

	public static void main(String[] args) {
	
		try {
			Class class1 = Class.forName(classname);
			Class class2 = new Hero().getClass();
			Class class3 = Hero.class;
			
			System.out.println(class1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
