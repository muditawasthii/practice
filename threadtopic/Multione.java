package threadtopic;

class Sample1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
 class Sample3 implements Runnable
 {
	 public void run()
	 {
		 for(int i=101;i<=110;i++)
			{
				System.out.println(i);
				try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
	 }
 }

public class Multione {
public static void main(String[] args) {
	Sample1 s = new Sample1();
	Thread th1 = new Thread(s);
	th1.start();
	Sample3 s2 = new Sample3();
	Thread th2 = new Thread(s2);
	th2.start();
}
}
