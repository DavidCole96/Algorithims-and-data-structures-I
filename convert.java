//David Cole
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class convert
{
   public static void main(String[] args)
   {
  
//part 1
   double c, f,doub;
   int num, randNum,length;
   String mutation1, message;
   message = "Celsius and Fahrenheit are related";
   mutation1 = message.toUpperCase();
   System.out.println(mutation1);
   String mutation2 = mutation1.toLowerCase();
   System.out.println(mutation2);
   length = message.length();
   System.out.println("The length of the message is: " + length);
   String mutation3 = message.replace('e','z');
   System.out.println(mutation3);
   String mutation4 = message.substring(12,22);
   System.out.println(mutation4);
   // part 2
   Random rand = new Random();
   doub = rand.nextFloat();
   System.out.println("Here is a number between 0.0 and 0.9999: " + doub);
   randNum = rand.nextInt(6) +5;
   System.out.println("Here is a random number between 5 and 10: " + randNum);
   // part 3
   DecimalFormat fmt = new DecimalFormat ("0.00");
   Scanner scan = new Scanner(System.in);
   System.out.println("Please enter an integer between 4 and 40");
   String num1 = scan.nextLine();
   num = Integer.parseInt(num1);
   f = (num * randNum);
   System.out.println("Here is the Fahrenheit number: " + fmt.format(f));
   // part 4
   c = (5.0/9.0) * (f - 32.0);
   System.out.println("Here is the celsius temp : " + c);
   
 }
}
   
   
   