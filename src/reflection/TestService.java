package reflection;
 
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;
 
public class TestService {
 
   // @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {
 
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("D:/javaee_workspace2/src/reflection/spring.txt");
        Properties springConfig= new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");
         
        //根据类名称创建类对象
        Class clazz = Class.forName(className);
        //根据方面名称，获取方法
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);
         
    }
}