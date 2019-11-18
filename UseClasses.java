//David Cole
//Made of my own efforts.
import java.util.Scanner;
import java.text.DecimalFormat;
public class UseClasses
{
   public static void main(String[] args)
   {
   DecimalFormat fmt = new DecimalFormat ("0.0000");
   System.out.println("Please enter a line of at least 10 characters");
   Scanner scan = new Scanner(System.in);
   String sfirst = scan.nextLine();
   System.out.println("here is the string you entered: "+sfirst);
   String ssecond = sfirst.toUpperCase();
   System.out.println ("Here is the string you entered in upper case: "+ssecond);
   String sthird = sfirst.toLowerCase();
   System.out.println("Here is the string you entered in lower case: "+sthird);
   String sfourth = sfirst.replace('e','f');
   System.out.println("Here is the string you entered with e instead of f: "+sfourth);
   int length = sfirst.length();
   String length1= Integer.toString(length);
   System.out.println("here is the length of the string: "+length1);
   char char1 = sfirst.charAt(4);
   System.out.println("Here is the fifth character: "+char1);
   String sub1 = sfirst.substring(5);
   System.out.println("Here is the 6th character onwards: "+sub1);
   double radius1,volume;
   String radius;
   System.out.println("Please enter a positive deicmal nubmer between 1.000 and 9.999");
   radius = scan.nextLine();
   radius1 = Double.parseDouble(radius);
   System.out.println("Here is the number you entered: "+radius);
   volume = (4.0/3.0* Math.PI * Math.pow(radius1,3));
   System.out.println("Here is the volume: "+fmt.format(volume));
   
   String myBox1;
   Box myBox = new Box(75);
   myBox1 = myBox.toString();
   System.out.println(myBox);
   }
}