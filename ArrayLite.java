//David Cole
//I assert that it is of my own efforts
import static java.util.Arrays.*;
import java.util.Scanner;
public class ArrayLite
{
public static void main(String[] args)
{
 String myBox1, prtgrade;
   Box myBox = new Box(85);
   myBox1 = myBox.toString();

System.out.println("Please enter the number of students in the class");
Scanner scan = new Scanner(System.in);
int limit=scan.nextInt();
scan.nextLine();
String[] students = new String [limit];


for (int i=0; i<limit;i++)
{
System.out.println("Please enter a students name: ");
students[i] = scan.nextLine();
}
System.out.println("This is the list of students starting with the first student in the class");
for (String temp : students)
{

System.out.println(temp);
}
System.out.println("This is a list of students starting with the last student in the class");
for (int x= limit; x>0; x--)
{
System.out.println(students[x - 1]);
}


System.out.println(myBox);


}



}
