import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadpoolFixed implements Runnable
{
	int s;
	ThreadpoolFixed(int s)
	{
		this.s=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" : "+s);
	}
	public static void main(String[] args)
	{
		int MAX_T=5;
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		for(int i=1;i<=10;i++)
		{
			Runnable s=new ThreadpoolFixed(i);
			pool.execute(s);
		}
	}

}
