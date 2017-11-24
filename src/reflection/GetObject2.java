package reflection;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

import charactor.ADHero;


/**
 * 
 * @author 377321
 *通过读取文件的方式来实现反射机制得到对象
 */
public class GetObject2 {

	public static void main(String[] args) {
	//1.read file
		File f =new File("/hero.conf");
		try {
			FileReader fr = new FileReader(f);
			char[] c = new char[(int) f.length()];
			fr.read(c);
			
		   String className = new String(c);
		   Class class1 = Class.forName(className);
		   Constructor constructor = class1.getConstructor();
		   ADHero h = (ADHero)constructor.newInstance();
		   h.phicAttack();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
