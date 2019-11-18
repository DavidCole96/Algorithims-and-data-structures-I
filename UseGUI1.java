//David Cole
//I assert that the program i am submitting is created of my own efforts
//1.  JFrame
//2.  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
//3.  JPanel
//4.  


import java.awt.*;
import javax.swing.*;
public class UseGUI1
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("David Cole - Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      
 
      JPanel primary = new JPanel();
      primary.setPreferredSize(new Dimension(300,400));
      JLabel label1 = new JLabel ("David Cole");
      label1.setPreferredSize (new Dimension(150, 100));
      JLabel label2 = new JLabel ("CSC 1051-003");
      label2.setPreferredSize (new Dimension(150, 100));
      JLabel label3 = new JLabel ("Lab 6.5");
      label3.setPreferredSize (new Dimension(150, 100));
      primary.add (label1);
      primary.add (label2);
      primary.add (label3);
      JLabel label4 = new JLabel ("Hello World");
      label4.setPreferredSize (new Dimension(150, 100));
      primary.add (label4);
      
      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);






   }
}