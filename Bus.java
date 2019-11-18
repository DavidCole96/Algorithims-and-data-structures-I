//David Cole
//Extra Credit
import javax.swing.JApplet;
import java.awt.*;
public class Bus extends JApplet
{
   public void paint (Graphics page)
   {
   final int MID = 150;
   final int TOP = 50;

   setBackground (Color.cyan);
   
   page.setColor (Color.black);
   page.fillRect (0,250,400,90);
 
   page.setColor (Color.black);
   page.fillOval (40,160,100,90);
 
   page.setColor (Color.black);
   page.fillOval (270,160,100,90); 
   
   page.setColor (Color.yellow);
   page.fillRect (0,20,400,140);
   
   page.setColor (Color.blue);
   page.fillRect (0,0,400,50);
   
   page.setColor (Color.white);
   page.fillOval (65,180,50,50);
   
   page.setColor (Color.white);
   page.fillOval (295,180,50,50);
   
   page.setColor (Color.white);
   page.fillRect (300,70,70,60);
   
   }
}
   