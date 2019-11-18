import java.util.Scanner;
import static java.util.Arrays.*;
public class UseArray
{
 public static void main(String[] args)
 {
 int size = 10;
 String myBox1;
   Box myBox = new Box(13);
   myBox1 = myBox.toString();
Scanner scan = new Scanner(System.in);
Compute myCompute = new Compute();  
String[] names = new String [size];
double[] grades = new double [size];  
System.out.println("Please enter one name, then press enter.  Follow this by his/her grade, \nthen press enter.  Follow this by a second name, etc.  For up to 10 people.");
for (int i=0; i<size;i++)
{
names[i] = scan.nextLine();
String myDouble1= scan.nextLine();
double myDouble = Double.parseDouble(myDouble1);
grades[i] = myDouble ;
}

double usum = myCompute.aver(grades,size);
System.out.println("Here is our clast list with their final grades");
for(int i = 0; i < names.length + grades.length; i++)
{
    if(i%2 == 0){
        
        System.out.println(names[i/2]);
    }
    else
    {
        System.out.println(grades[i/2]);
        }
    }
    System.out.println("The sum of all the grades is: "+usum);
  System.out.println(myCompute);
   System.out.println(myBox);  
  }  

}