//Natalie Saba
//Part 1
//
//
import java.util.Scanner;
public class StringDemo
{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner (System.in);
   String firstName,lastName,subFirst,subLast,mutation2,m3,m4,m5,m6,m7;
   int length1;
   System.out.println("------------------------------------------------------------------");
   System.out.println("-                        Natalie Sabe                            -");
   System.out.println("-                        CSC 1051                                -");
   System.out.println("-                        Project 5 Read.Java                     -");
   System.out.println("------------------------------------------------------------------");
   System.out.println("please enter your first name");
   firstName = scan.nextLine();
   System.out.println("please enter your last name");
   lastName = scan.nextLine();
   subFirst = firstName.substring(0,1);
   subLast = lastName.substring(0,4);
   System.out.println(subFirst + "." + subLast);
   String mutation1 = firstName.toUpperCase();
   System.out.println(mutation1);
   length1 = lastName.length();
   System.out.println("The last name: "+lastName+ " has " + length1 + "letters");
   mutation2 = lastName.replace('e','Y');
   System.out.println(mutation2);
   m3 = "Quest for the holy Grail";
   System.out.println("\""+m3+"\"");
   m4 = m3.toLowerCase();
   System.out.println(m4);
   m5 = m3.concat(' ' +m4); 
   System.out.println(m5);
   m6 = m5.replace('g','z');
   System.out.println(m6);
   m7 = m6.substring(6,24);
   System.out.println(m7);
   }
}