public class ThreadRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Running Child Thread - "+ Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		ThreadRunnable th=new ThreadRunnable();
		Thread t=new Thread(th);
		t.start();
		System.out.println("Running Main Thread - "+ Thread.currentThread().getName());
	}

}
