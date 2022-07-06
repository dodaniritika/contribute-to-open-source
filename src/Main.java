public class Main
{
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
    double a = 5.865;
    double b = 0.00001;

    System.out.println(divide (a, b));
  }
}