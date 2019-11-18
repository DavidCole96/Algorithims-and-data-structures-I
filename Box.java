//David Cole
//I assert that this program is created of my own efforts.
public class Box
{
   int projectNum;
   
   Box(int pnumb)
   {
      projectNum = pnumb;
   }
   
   public String toString()
   {
   String box;
   box = "\n------------------------------------------------------------------\n-                        David Cole                              -\n-                        CSC 1051-003                            -\n-                        Project "+projectNum+ " Read.Java                     -\n------------------------------------------------------------------";
   return box;
   }
   void change(int par1)
   {
   projectNum = par1;
   }
   int whatNumb()
   {
   return projectNum;
   }






}