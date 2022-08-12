class ThreadExtendFive extends Thread
{
	public void run()
    {
        System.out.println("Hello All");
    }
    public static void main(String[] args)
    {
    	ThreadExtendFive t1=new ThreadExtendFive();
    	t1.start();
    	ThreadExtendFive t2=new ThreadExtendFive();
    	t2.start();
    	ThreadExtendFive t3=new ThreadExtendFive();
    	t3.start();
    	ThreadExtendFive t4=new ThreadExtendFive();
    	t4.start();
    	ThreadExtendFive t5=new ThreadExtendFive();
    	t5.start();

	}

}
