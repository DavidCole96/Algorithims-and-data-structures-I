//David Cole
//I assert that this program is done entirely of my own efforts.
import java.util.Scanner;
public class Read
{
   public static void main (String[] args)
   {
   Scanner scan = new Scanner(System.in);
   String messageOne,messageTwo;
   int num,truncated;
   double dubOne,dubTwo,floated;
   System.out.println ("Please enter a string of more than one word");
   messageOne= scan.nextLine();
   System.out.println ("Here is your text: " + messageOne);
   System.out.println ("Please enter one word");
   messageTwo= scan.nextLine();
   System.out.println ("Here is your word: " + messageTwo);
   System.out.println ("Please enter an integer");
   num = scan.nextInt();
   System.out.println ("Here is the integer you typed in: " + num);
   System.out.println ("Please enter a decimal number");
   dubOne = scan.nextDouble();
   System.out.println ("Here is the decimal number you typed in: " + dubOne);
   dubTwo = num * dubOne;
   System.out.println ("multiplied " + num + " by " + dubOne + " and got " + dubTwo);
   floated = (double)num;
   System.out.println ("Here is your integer floated= " + floated);
   truncated = (int)dubOne;
   System.out.println ("Here is your double truncated= " + truncated);
   System.out.println("------------------------------------------------------------------");
   System.out.println("-                        David Cole                              -");
   System.out.println("-                        CSC 1051-003                            -");
   System.out.println("-                        Project 3 Read.Java                     -");
   System.out.println("------------------------------------------------------------------");
   }
  }
   
   