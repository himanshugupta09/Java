interface Human
{
   void getName(String name);
   String getName();
   //void doJob();
}

class Programmer implements Human
{
	String name;
  public void setName(String name)
  {
	name = name;
  }
  String getName(String name)
  {
     return "Name is : "+name;
  }
}

class Man
{
  public static void main(String args[])
  {
     Human h = new Progrmammer();
     h.setName("Harish");
     h.getName();
  }
}


    

   
   