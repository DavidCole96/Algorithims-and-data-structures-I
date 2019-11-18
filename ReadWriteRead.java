//David Cole
//ReadWriteRead.java
//I assert that this program is of my own efforts
import java.util.Scanner; 
import java.io.*;
public class ReadWriteRead
{
public static void main(String[] args)throws IOException
{
String myBox1;
   Scanner scan = new Scanner (System.in);
   Box myBox = new Box(145);
   myBox1 = myBox.toString();
   int first, second, third;
   File f1 = new File ("Data.dat");
   Scanner fileScan = new Scanner (f1);
   first = fileScan.nextInt();
   second = fileScan.nextInt();
   third = fileScan.nextInt();
   System.out.println("The following values have been read in from a file:\nfirst="+first+" second="+second+" third="+third);
   String f2 = "test2.dat";
   PrintWriter outFile = new PrintWriter(f2);
   System.out.print(15+"    ");
   System.out.print(20+"    ");
   
   outFile.println(15+"    ");
   outFile.println(20+"    ");
   System.out.println("\n"+25+"    ");
   System.out.println(30+"    ");
   outFile.println(25+"    ");
   outFile.println(30+"    ");

   outFile.close();
   File fileName=new File(f2);
Scanner fileScan2=new Scanner(fileName);
   int n1,n2,n3,n4;
    n1 = fileScan2.nextInt();
    n2 = fileScan2.nextInt();
    n3 = fileScan2.nextInt();
    n4 = fileScan2.nextInt();
    

   System.out.println(n1);
   System.out.println(n2);
   System.out.println(n3);
   System.out.println(n4);

   System.out.println(myBox1);
   
   }
   }

