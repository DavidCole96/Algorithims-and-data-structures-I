public class BasicArray
{
  final static int LIMIT = 12;
  final static int MULTIPLE = 10;
 
  public static void main (String[] args)
  {
   int [ ] list = new int[LIMIT];
 
   for (int index = 0; index < LIMIT; index++)
      list[index] = index * MULTIPLE;
 
   list[5] = 555;  // change one array value
   System.out.println(list[2]);
   }
}