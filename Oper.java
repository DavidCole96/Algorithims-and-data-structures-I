// David Cole
// File Name: Oper.java
//I assert that the program I am submitting is a result of my own efforts
//
public class Oper
{
 public static void main(String[] args)  //method name is main
 {
//
//---------Part 1-----
//
System.out.println("------------------------------------------------------------------");
System.out.println("-                        David Cole                              -");
System.out.println("-                        CSC 1051-003                            -");
System.out.println("-                        Project #2 -Part 1                      -");
System.out.println("------------------------------------------------------------------");
//
//---------Part 2-----
//
System.out.println("hello " + "there");
System.out.println("I am " + 5);
System.out.print("I am " + (5+5));
System.out.println("\n\n");
System.out.println("\"BZ is the dopest teacher\"");
//   
//---------Part 3-----
//   
int pear,pearPrice,totalPears,peas,peaPrice,totalPeas,GrandTotal;
pear=7;
peas=3;
pearPrice=75;
peaPrice=80;
totalPears=pearPrice * pear;
System.out.println("Total Pears = " + totalPears); 
totalPeas= peaPrice * peas;
System.out.println("Total Peas = " + totalPeas);
GrandTotal=totalPears + totalPeas;
System.out.println("Grand Total = " + GrandTotal);
System.out.println("\n");

double pearDec,pearPriceDec,totalPearDec,peasDec,peaPriceDec,totalPeasDec,grandTotalDec;
pearDec = 7;
peasDec = 3;
pearPriceDec = .75;
peaPriceDec = .80;
totalPeasDec = peasDec * peaPriceDec; 
System.out.println("Total Peas = " + totalPeasDec);
totalPearDec = pearDec * pearPriceDec;
System.out.println("Total Pears = " + totalPearDec);
grandTotalDec = totalPeasDec + totalPearDec;
System.out.println("Grand Total = " + grandTotalDec);
System.out.print("\n\n"); 
//
//---------Part 4-----
//

int remainder,quotient,ten,three,five;
remainder = 0;
quotient = 0;
ten = 10;
three = 3;
five = 5;
remainder = ten % three;
System.out.println ("The remainder of 10 divided by 3 is = " + remainder);
remainder = three % 10;
System.out.println("The remainder of 3 divided by 10 is = " + remainder);
quotient = five / 3 ;
System.out.println ("The truncated quotient of five divided by 3 is: " + quotient);

double remainderDec,quotientDec,tenDec,threeDec,fiveDec;
remainderDec = 0;
quotientDec = 0;
tenDec = 10.0;
threeDec = 3.0;
fiveDec = 5.0;
remainderDec = tenDec % threeDec;
System.out.println ("The double remainder of ten divdided by three is: " + remainderDec);
quotientDec = fiveDec / threeDec;
System.out.println("The double quotient of five divided by three is: " + quotientDec);
 
   
   
   
   
   } //end of method main
}  // end of class Oper