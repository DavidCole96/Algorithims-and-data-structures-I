//David Cole
import java.util.Scanner;
import java.text.DecimalFormat;
public class Letter
{
DecimalFormat fmt = new DecimalFormat("0.00");
    String name;
   double grade;
  public Letter(String p1, double p3)
   {
   name = p1;
   grade = p3; 
  
    
   }
   public String toString()
   {

      String gradeA = String.valueOf(fmt.format(grade));
     
     
      String end = "Dear " + name + " Congratulations \n Your grade point average is: " + gradeA;
      return end ;
      }
      void change1(String par1)
      {
      name = par1;
      }
      void change2(double par1)
      {
      grade =par1;
      }
  
  }
   
 