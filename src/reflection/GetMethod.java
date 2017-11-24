package reflection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 首先根据这个配置文件，使用反射实例化出两个英雄出来。
然后通过反射给这两个英雄设置名称，接着再通过反射，调用第一个英雄的attackHero方法，攻击第二个英雄
 *
 */
public class GetMethod {
	public static void main(String[] args) {
		File f = new File("/hero.conf");
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
				System.out.println(line);
			}
			className1 = s[0];
			heroName1 = s[1];
			className2 = s[2];
			heroName2 =s[3];
			br.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
