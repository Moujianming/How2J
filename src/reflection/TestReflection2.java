package reflection;
/**
 * synchronized同步类的使用
 * @author 377321
 *
 */
public class TestReflection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t2 = new Thread(){
			public void run()
			{
				TestReflection2.method2();
			}
		};
		t2.setName("method2");
		t2.start();
		
		Thread t1 = new Thread(){
			public void run()
			{
				TestReflection2.method1();
			}
		};
		t1.setName("method1");
		t1.start();
		
	}
	public static void method1()
	{
		synchronized (TestReflection2.class) {
			System.out.println(Thread.currentThread().getName()+" get the source");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized static void method2()
	{
		System.out.println(Thread.currentThread().getName()+" get the source");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
