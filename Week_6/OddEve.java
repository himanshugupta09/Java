// Java Program to print Odd Even using concept of thread



class EvenThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i+=2)
		{
		   System.out.println(i);
		}
	}
}

class OddThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i+=2)
		{
		   System.out.println(i);
		}
	}
}

class OddEve
{
     public static void main(String args[])
	{
		EvenThread Eve = new EvenThread();
		OddThread Odd = new OddThread();
		Eve.start();
		Odd.start();
	}
}

