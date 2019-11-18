//David Cole
//I assert that this was my own efforts
import java.util.Scanner;
import java.text.DecimalFormat;
public class nestedIf
{
   public static void main (String[] args)
   {
   Box myBox = new Box(10);
   System.out.println("Please enter the number of rows in the triangle, must be greater than 5");
   Scanner scan = new Scanner(System.in);
   int numLines = scan.nextInt();
   if (numLines < 5)
   {
   System.out.println("Error number of rows entered is less than 5");
   }
   {

int i = 1;
int j = 1;
while( i <= numLines) 
{

while( j <= i) 
{


System.out.print("#");
j++;
}
System.out.println("");
i++;
j=1;
}
  
   
    System.out.println("Please enter the number of rows for the second triangle");
    int numLines1 = scan.nextInt();
   if (numLines1 <= 5)
   {
   System.out.println("Error number of rows entered is less than 5");
   }
   int x = 1, y = 1, counter = 2;
   do
   {
   System.out.println("");
   
   
   

      do 
      {
      System.out.print("%");
      x ++;
      }while (x <= y);
      y++;
      x=1;
     }while ( y <= numLines);
      System.out.println("\nPlease enter the number of rows for the second triangle");
    int numStar = scan.nextInt();
   if (numStar <= 5)
   {
   System.out.println("Error number of rows entered is less than 5");
   }
   
   for (int a=1; a!=numStar;a++)
   {
   System.out.println();
   for (int d=1; d!=a;d++)
   {
   System.out.print("*");
   }
  
   }
   System.out.println(myBox);
  
     
     
     
     
     
     
     
     }     

}
}     
   
 

    
 


     
  
   
   