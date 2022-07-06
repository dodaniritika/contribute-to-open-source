public class Main
{
  public static double add (double a, double b)
  {
    return a + b;
}
  public static double divide (double a, double b)
  {
        if(b == 0) {  
            throw new ArithmeticException("Division by 0");    
        }  
        else {  
            return a/b;
        }
  }

  public static void main (String[]args)
  {

    double a = 2.5;
    double b = 5.865;

    System.out.println(add (a, b));

    System.out.println(divide (a, b));
  }
}