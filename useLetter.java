//David Cole
import java.util.Scanner;

public class useLetter
{
 public static void main(String[] args)
   {
   String myBox1;
   Box myBox = new Box(80);
   myBox1 = myBox.toString();
   
   System.out.println("please enter a sutdents name:");
   Scanner scan = new Scanner(System.in);
   String sname = scan.nextLine();
   System.out.println("Please enter the students GPA as 00.00 format");
   double sgrade = scan.nextDouble();
   System.out.println("Here is the students name: "+sname+"\nHere is the students GPA: "+sgrade);
   Letter myLetter = new Letter(sname, sgrade);
   
   myLetter.toString();
   System.out.println(myLetter);
   System.out.println(myBox);
   
   
   }
  
  }
