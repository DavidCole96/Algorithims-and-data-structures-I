// Testing wrapper methods parseInt and parseDouble
import java.util.Scanner;
public class TryDouble2
{public static void main(String[] args)
{
Scanner scan = new Scanner (System.in);
System.out.println ("Please enter an integer number");
String myInput = scan.nextLine();
int myInt = Integer.parseInt (myInput);
System.out.println ("myInt= " + myInt);
System.out.println ("Please enter a double number");
myInput = scan.nextLine();
double myDouble = Double.parseDouble(myInput);
System.out.println ("MyDouble= " + myDouble);
double ans = myInt * myDouble;
System.out.println ("Multiplying the two numbers proves they were converted = " + ans);
}
}

