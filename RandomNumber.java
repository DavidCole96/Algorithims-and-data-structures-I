import java.util.Random;
import java.util.Scanner;
public class RandomNumber
{
   public int randomInRange(int min,int max)
   {
   Random rand = new Random();
   int low, high,rand1;
   low = min;
   high = max + 1;
   rand1 = rand.nextInt(high) + low;
   return rand1;
   }
}
   