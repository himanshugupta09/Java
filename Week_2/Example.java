import java.lang.*;

class Calculator{
    double i;
    double x = Math.sqrt(i);

}

class Example{
    public static void main(String args[]) {
        Calculator a = new Calculator();
        a.i = 25;
        System.out.println("Sqaure Root of "+a.i+"  is  "+a.x);
        
    }
}