package com.sapient.abc;

public class Threa extends Thread {

	Resourcelock lock;
	public Threa(Resourcelock lock) {
			this.lock=lock;
	}

	public void run()
	{
		try {
			synchronized(lock)
			{
				for(int i=0;i<10;i++)
					{
						while(lock.flag!=1)
							{lock.wait();}
						System.out.printf("tic-");
						lock.flag=2;

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
