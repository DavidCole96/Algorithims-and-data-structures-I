//David Cole
import java.awt.*;
import javax.swing.*;
public class UseGUI2
{
   public static void main (String[] args)
   {
   JFrame frame = new JFrame ("Label Demo");
   frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

 
      
   JPanel primary = new JPanel();
   primary.setPreferredSize(new Dimension(500,500));
   primary.setBackground (Color.green);
   
   JPanel subPanel1 = new JPanel();
   subPanel1.setPreferredSize (new Dimension(250,250));
   subPanel1.setBackground (Color.red);
   JLabel label1 = new JLabel ("David Cole");
   label1.setPreferredSize (new Dimension(150, 100));
   JLabel label2 = new JLabel ("CSC 1051-003");
   label2.setPreferredSize (new Dimension(150, 100));
   JLabel label3 = new JLabel ("Lab 6.5");
   label3.setPreferredSize (new Dimension(150, 100));
   subPanel1.add (label1);
   subPanel1.add (label2);
   subPanel1.add (label3);   
   
   JPanel subPanel2 = new JPanel();
   subPanel2.setPreferredSize (new Dimension(250, 250));
   subPanel2.setBackground (Color.blue);
   JLabel label4 = new JLabel ("Hello World");
   label4.setPreferredSize (new Dimension(150, 100));
   subPanel2.add (label4);
   
   primary.add(subPanel1);
   primary.add(subPanel2);
   
    frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
   }
}
   