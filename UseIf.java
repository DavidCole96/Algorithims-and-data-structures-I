//David Cole
import java.util.Scanner;
import java.text.DecimalFormat;
public class UseIf

{
 public static void main(String[] args)
   {
   DecimalFormat fmt = new DecimalFormat("0.00");
   String myBox1, prtgrade;
   Box myBox = new Box(85);
   myBox1 = myBox.toString();
   double sgrade;
   Calc myCalc = new Calc();
   
      
   
   
   
   System.out.println("please enter a sutdents name:");
   Scanner scan = new Scanner(System.in);
   String sname = scan.nextLine();
   System.out.println("Please enter the students GPA as 00.00 format");
   sgrade = scan.nextDouble();
   System.out.println("Here is the students name: "+sname+"\nHere is the students GPA: "+ fmt.format(sgrade));
   if (sgrade < 80)
   {
   System.out.println("Student " + sname + " does not belond in the group of studnets being processed.");
   }
   if (sgrade > 80)
   {
   prtgrade = myCalc.calculate(sgrade);
   LetterB myLetter = new LetterB(sname, prtgrade,sgrade);
   System.out.println(myLetter);
   
  

   
   myLetter.toString();
   }
   System.out.println(myBox);
   
   
   }
  
  }