//David Cole
//I assert that this is of my own efforts
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI
{
   public static void main(String[] args)
   {
   DecimalFormat fmt = new DecimalFormat ("0.00");
   String wghtstring,wghtstring2,hgtstr1,hgtstr2;
   Scanner scan = new Scanner(System.in);
   System.out.println("Please write the phrase \"My weight is XXX pounds\" without the quotation marks");
   wghtstring = scan.nextLine();
   wghtstring2= wghtstring.substring(13,16);
   int weight = Integer.parseInt(wghtstring2);
   System.out.println("Please write the phrase \"My height is YY inches\" without the quotation marks");
   hgtstr1 = scan.nextLine();
   hgtstr2 = hgtstr1.substring(13,15);
   int height = Integer.parseInt(hgtstr2);
   double height2,bmi;
   System.out.println("Height = "+fmt.format(height));
   height2= Math.pow (height , 2);
   System.out.println("Height squared = "+fmt.format(height2));
   System.out.println("Weight = "+ fmt.format(weight));
   bmi = (weight/height2)*703;
   System.out.println("BMI = "+fmt.format(bmi));
   int iA,iB,absB;
   double dC,floorC,powA;
   System.out.println("Please enter a positive integer");
   iA = scan.nextInt();
   System.out.println("Please enter a negative integer");
   iB = scan.nextInt();
   System.out.println("Please enter a positive decimal number");
   dC = scan.nextDouble();
   System.out.println("Your positive decimal number was: "+fmt.format(dC));
   absB = Math.abs(iB);
   System.out.println("Here is the absolute value of the negative integer: "+absB);
   powA= Math.pow(iA, 5);
   System.out.println("Here is the positive integer you entered to the 5th power: "+powA);
   floorC = Math.floor(dC);
   System.out.println("Here is the floor of the decimal number you inputted: "+floorC);
   System.out.println("------------------------------------------------------------------");
   System.out.println("-                        David Cole                              -");
   System.out.println("-                        CSC 1051-003                            -");
   System.out.println("-                        Project #6                              -");
   System.out.println("------------------------------------------------------------------");   
   }
}