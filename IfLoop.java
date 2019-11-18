//David Cole
//Created of my own efforts
import java.util.Scanner;
import java.text.DecimalFormat;
public class IfLoop
{
   public static void main(String[] args)
   {
   int countGood =0;
   int countBad = 0;
   double sgrade;
   String myBox1, prtgrade, sname;
   Box myBox = new Box(9);
   myBox1 = myBox.toString();
   System.out.println(myBox);
   Calc myCalc = new Calc();
   
   int numStud = 0;
   System.out.println("Please enter the number of students as an integer");
   Scanner scan = new Scanner(System.in);
   numStud = scan.nextInt();
   scan.nextLine();
   System.out.println(numStud);
   System.out.println("Please enter a students first and last name and then press enter");
   sname = scan.nextLine();
   System.out.println("Please enter the students GPA in a 00.00 format");
   sgrade = scan.nextDouble();
   scan.nextLine();
   System.out.println("The students name is: " + sname+ "\nThe students GPA is: "+ sgrade);
   if (sgrade < 80)
   {
   System.out.println("Student "+ sname+" does not belong in the group of students being processed");
   countBad ++;
   numStud ++;
   }
   if (sgrade >= 80)
   {
   countGood ++;
   prtgrade = myCalc.calculate(sgrade);
   LetterB myLetter = new LetterB(sname, prtgrade,sgrade);
   System.out.println(myLetter);
   
   myLetter.toString();
   numStud ++;
   }
   System.out.println("There were "+countGood+" Good studnets \nThere were "+countBad+" Bad students");
   System.out.println(myBox);

}
}   

   
   