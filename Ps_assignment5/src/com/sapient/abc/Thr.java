package com.sapient.abc;

public class Thr extends Thread {
	Resourcelock lock;

	public Thr(Resourcelock lock) {
			this.lock =lock;
	}

	public void run()
	{
		try {
			synchronized(lock)
			{
				for(int i=0;i<10;i++)
				{
					while(lock.flag!=2)
						{lock.wait();}
					System.out.println("toc");
					lock.flag=1;
					Thread.sleep(10);
			
					lock.notifyAll();
				}
			}
			}
		catch (Exception e) 
			{
				System.out.println(e.getMessage());
	
			}
	}
}
