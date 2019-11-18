//David Cole
import java.util.Scanner;
import java.text.DecimalFormat;
public class UseAlarm
{
public static void main (String[] args)
  {
  System.out.println("Please enter an hour(between 1-12):");
  Scanner scan = new Scanner(System.in);
  int hour = scan.nextInt();
  if (hour < 0 || hour > 12)
   {
    System.out.println("You entered an invalid nubmer");
    }
   System.out.println("Please enter a minute between 0 and 59:");
   int minute = scan.nextInt();
   if (minute<0 || minute > 59)
   {
   System.out.println("you entered an invalid number");
   }
   Alarm myAlarm = new Alarm(hour, minute);
   myAlarm.toString();
   System.out.println(myAlarm);
   }
   }
  
  
   