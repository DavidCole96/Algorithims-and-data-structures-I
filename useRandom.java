//David Cole
//1.  the import statement imports the Random class which gives the capability of generating new numbers
//2.  next.Int();
//3.  it can be positive or negative
//4.  Random generator = new Random();
//5.  num1 = generator.nextInt();
//6.  The range is from negative infinity to positive infinity
//7.  num1 = generator.nextInt(11)
/* Algorithm for finding the breakdown of hours minutes seconds.
   int seconds,hours,minutes,leftMin,leftSec;
   seconds = totalSeconds;
   minutes = seconds/60;
   hours = minutes/60;
   leftMin = minutes%60;
   leftSec = seconds%60;
   System.out.println("Hours= " + hours );
   System.out.println("Minutes= " + leftMin );
   System.out.println("Seconds= " + leftSec);
*/
import java.util.Random;
public class useRandom
{
   public static void main (String[] args)
   {
   Random rand = new Random();
   int num1,num2,totalSeconds;
   num1 = rand.nextInt();
   System.out.println("Here is the number from the number generator: " + num1);
   num2 = rand.nextInt(10)+1;
   System.out.println("Here is a positive number in the range of 1-10: "+num2);
   totalSeconds = num2 * 20000;
   System.out.println("Here is the total number of seconds: "+totalSeconds);
   //break
   int seconds,hours,minutes,leftMin,leftSec;
   seconds = totalSeconds;
   minutes = seconds/60;
   hours = minutes/60;
   leftMin = minutes%60;
   leftSec = seconds%60;
   System.out.println("Hours= " + hours );
   System.out.println("Minutes= " + leftMin );
   System.out.println("Seconds= " + leftSec);
   System.out.println("------------------------------------------------------------------");
   System.out.println("-                        David Cole                              -");
   System.out.println("-                        CSC 1051-003                            -");
   System.out.println("-                        Project #5                              -");
   System.out.println("------------------------------------------------------------------");
   int newhours,years,weeks,days,leftdays,leftweeks;
   newhours = hours*50000;
   System.out.println("New Hours = "+newhours);
   days = newhours/24;
   weeks = days/7;
   years = weeks/52;
   leftdays = days%24;
   leftweeks = weeks%52;
   System.out.println("Days =" + leftdays);
   System.out.println("Weeks =" +leftweeks);
   System.out.println("Years =" + years);
   }
}
   