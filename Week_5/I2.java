abstract class C
{
	
	public static int j = 111;
	
	void print(){
		System.out.println("Geek1");
	}
}


interface I2 implements C
{
	public static int j = 222;

	void print(){
		System.out.println("Geek2");
	}
}
