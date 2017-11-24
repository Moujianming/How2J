package reflection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;

/**
 * 首先根据这个配置文件，使用反射实例化出两个英雄出来。
然后通过反射给这两个英雄设置名称，接着再通过反射，调用第一个英雄的attackHero方法，攻击第二个英雄
 *
 */
public class GetMethod {
	public static void main(String[] args) {
		File f = new File("D:/javaee_workspace2/src/reflection/hero.conf");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);		
			String className1,className2;
			String heroName1,heroName2;
			String[] s = new String[4];
			String line;
			int i =0;
			while( (line = br.readLine())!=null)
			{
				s[i] = line;
				i++;
			}
			className1 = s[0];
			heroName1 = s[1];
			className2 = s[2];
			heroName2 =s[3];
			br.close();
			fr.close();
			Class c1 = Class.forName(className1);
			Constructor constructor1 = c1.getConstructor();
			/*APHero h1 = (APHero)constructor1.newInstance();
			h1.setName("gareen");*/
			Object h1 = constructor1.newInstance();
		    Field f1 = c1.getField("name");
		    f1.set(h1, heroName1);
		    
		   Class c2 = Class.forName(className2);
		   Constructor constructor2 = c2.getConstructor();
		   Object h2 = constructor2.newInstance();
		   Field f2 = c2.getField("name");
		   f2.set(h2, heroName2);
		  /* ADHero h2 = (ADHero)constructor2.newInstance();
		   h2.setName("teemo");*/
			
		   
		     Method m1 = c1.getMethod("attackHero", Hero.class);
		     m1.invoke(h1, h2);
		   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
