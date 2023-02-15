package threadtopic;

class Sample extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
 class Sample2 implements Runnable
 {
	 public void run()
	 {
		 System.out.println("world");
	 }
 }

public class Multi {
public static void main(String[] args) {
	Sample s = new Sample();
	Thread th1 = new Thread(s);
	th1.run();
	Sample2 s2 = new Sample2();
	Thread th2 = new Thread(s2);
	th2.start();
}
}
