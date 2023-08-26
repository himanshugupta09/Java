import myInterface.*;

class Demo implements anInterface{

	public void display()
	{
		System.out.println("Fine");
	}

	public static void main(String args[]){
		Demo d = new Demo();
		d.display();
		System.out.println("The Final value in myInterface "+ a);
	}
}