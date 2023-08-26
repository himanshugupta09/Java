abstract class Bike{

	abstract void run();
}

class Yamha extends Bike{

	void run()
	{
	  System.out.println("Speed is 120 ms\n");
	}
	
	public static void main(String args[]){
	
		Yamha y = new Yamha();
		y.run();
	}

}

