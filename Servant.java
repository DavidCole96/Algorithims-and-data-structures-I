import java.util.Arrays;
public class Servant
{
   int[] array1 = {1,2,3};
   int[] array2 = {3,4,5};
   int[] array3 = {7,8,9};
   public void switchThem(int[] aarray, int[]barray)
   {
   array1 = aarray;
   array2 = barray;
   array3 = array1;
   array1 = array2;
   array2 = array1;
    
   
   
   }
   }
   