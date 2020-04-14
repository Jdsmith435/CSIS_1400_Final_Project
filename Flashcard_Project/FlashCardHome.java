import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;


   public class FlashCardHome extends JFrame implements ActionListener{
   
      //Objects for GUI
      JLabel jl;
      JButton jb, jb2;
      JPanel jp;
   
      public static void main (String [] args){
         FlashCardHome fch = new FlashCardHome();
      }
      
      //Method to create the GUI
      public FlashCardHome (){
      
         //GUI Interface details
         setTitle("Flash Card Home");
         setSize(500, 500);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         //Creating a Panel
         jp = new JPanel();
         
         //New JLabel
         jl = new JLabel("\t What Would You Like To Do?");
         jl.setPreferredSize(new Dimension(175, 100));
         jl.setVerticalAlignment(JLabel.TOP);
         jp.add(jl);
         add(jp);
         
         //Creating a Button
         jb = new JButton("Create Flash Cards");
         jb2 = new JButton("Review Flash Cards");
         jp.add(jb);
         jp.add(jb2);
         jb.addActionListener(this);
      }
      
         public void actionPerformed (ActionEvent e){

      }
   }