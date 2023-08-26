interface I1
{
	double x = 4.444;
	void methodI1();
}

interface I2 extends I1
{
	double y = 5.555;
	void methodI2();
}


class A1 implements I2
{
 	public int a1 = 555;
	
	public void methodI1()
	{
		System.out.println("From I1"+x+y);
	}

	public void methodI2()
	{
		System.out.println("From I2"+x+y);
	}
}

public class Demo2
{
	public static void main(String[] args){
	
		A1 a = new A1();
		a.methodI1();
		a.methodI2();
	}
}
