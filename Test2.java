//David Cole
import java.util.Scanner;
public class Test2
{
   public static void main (String[] args)
   {
   double average,num1,num2,num3;
   Scanner scan = new Scanner (System.in);
   System.out.println("Please enter a double value");
   num1 = scan.nextDouble();
   System.out.println("Please enter a double value");
   num2 = scan.nextDouble();
   System.out.println("Please enter a double value");
   num3 = scan.nextDouble();
   System.out.println("The double numbers that you entered are: "+num1+","+num2+","+num3);
   average = (num1+num2+num3)/3;
   System.out.println("The average of the three double numbers that you inputted is: " +average);
   }
}