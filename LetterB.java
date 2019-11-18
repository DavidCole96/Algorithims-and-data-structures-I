//David Cole
import java.util.Scanner;
import java.text.DecimalFormat;
public class LetterB
{
DecimalFormat fmt = new DecimalFormat("0.00");
    String name, lettergrade;
   double grade;
  public LetterB(String p1, String p2,double p3)
   {
   name = p1;
   grade = p3;
   lettergrade = p2; 
  
    
   }
   public String toString()
   {

      String gradeA = String.valueOf(fmt.format(grade));
     
     
      String end = "Dear " + name + " Congratulations \n Your grade point average is: " + gradeA + "\n This means you will get a grade of " + lettergrade;
      return end ;
      }
      
  
  }
   