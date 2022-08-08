public class ThreadExtend extends Thread
{
    public void run()
    {
        System.out.println("Running Child Thread - "+currentThread().getName());
    }
    public static void main(String[] args)
    {
    	ThreadExtend t=new ThreadExtend();
    	t.start();
    	System.out.println("Running Main Thread - "+Thread.currentThread().getName());
	}

}
