package DemoExtendThreads;

//creating threads using extended threads
class Sample extends Thread
{
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("This is: "+i);
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static void main(String args[])
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.start();
		s2.start();
	}
}
