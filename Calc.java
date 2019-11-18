public class Calc
{
   public Calc()
   {
   
  System.out.println("The constructor of Calc.java has been called");
}
   double gpa;
  String calculate(double p4)
  {
  gpa = p4;
  String result;
  result = " ";
  if (gpa <= 100.00 && gpa >=95.00)
  {
  result = "A";
  }
  if (gpa < 95.00 && gpa >= 90.00)
  {
  result = "A-";
  }
  if (gpa >= 87.00 && gpa < 90.00)
  {
 result = "B+";
  }
  if (gpa < 87.00 && gpa >= 83.00)
  {
  result = "B";
  }
  if (gpa < 83.00 && gpa >= 80.00)
  {
  result = "B-";
 }

  return result;
  }
}
    