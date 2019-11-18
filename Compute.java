public class Compute
{
double sum = 0, classAverage = 0;
public double aver(double[] aarray, int anumb)
{
for ( double i : aarray)
   {
   sum += i;
   }
   classAverage = sum / anumb;
   return sum;
   
   
   
}
public String toString()
{
String end = "The class average is "+classAverage;
return end;
}
}
   