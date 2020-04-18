import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;

public class ReviewFlashCard extends JFrame{

      //Objects for GUI
      JLabel jl;
      JButton jb, jb2;
      JPanel jp;
      
public static void main (String [] args) {

}

public ReviewFlashCard () {

      setTitle("Review Flash Cards");
      setSize(500, 500);
      setVisible(true);
      
      jp = new JPanel();
      
      jl = new JLabel("\t FIX ME");
      jl.setPreferredSize(new Dimension(175, 100));
      jl.setVerticalAlignment(JLabel.TOP);
      jp.add(jl);
      add(jp);
   }
}
