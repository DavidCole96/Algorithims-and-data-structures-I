//David Cole
//I assert that this program is of my own efforts
import java.util.Scanner;
public class TestRead
{
   public static void main (String[] args)
   {
   Scanner scan = new Scanner (System.in);
   String name;
   System.out.println( "Enter your name");
   name = scan.nextLine();
   String pet;
   System.out.println("What type of Pet do you have");
   pet = scan.nextLine();
   String petname;
   System.out.println("What is the name of your pet?");
   petname = scan.nextLine();
   int age;
   System.out.println("How old are you?");
   age = scan.nextInt();
   System.out.println("Hi my name is " + name + ", I am " + age + " years old.  I have a " + pet + " named " + petname + ".  He is a wonderful friend.  We go everywhere together. I love my dog he is yellow");
}
}       
   