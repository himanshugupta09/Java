interface Person
{
	void name();
	void age();
}
class Main implements Person
{
	public void name()
	{
 	   System.out.println("Smanata");
	}
      public void age()
	{
	  System.out.println(45);
	}



	public static void main(String args[])
  	{
 		Main t = new Main();
		t.name();
		t.age();
  	}
}

