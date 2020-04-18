import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Scanner;

//Creating the GUI/Flashcard Array fields
public class CreateFlashCard extends JFrame implements ActionListener{

      //Objects for GUI
      JLabel jl, jl2, jl3, jl4;
      JButton jb, jb2, jb3, jb4;
      JPanel jp;
      JTextField jt;
      
      private String cQuestion;
      private int numQuestion;
      private int length;
      
      String[] question = new String[3];
      String[] answer = new String[3];
      
      Scanner input = new Scanner(System.in);
       
public static void main (String [] args) {
    
}

public CreateFlashCard () {

      //Creating GUI
      setTitle("Create Flash Cards");
      setSize(500, 500);
      setVisible(true);
      
      jp = new JPanel();
      
      //Fix Me Located Here
      jl = new JLabel("Would you like to create or review?");
      jl.setPreferredSize(new Dimension(225, 100));
      jl.setVerticalAlignment(JLabel.TOP);
      jp.add(jl);
      add(jp);
      
      //Adding Buttons for Create and Review
      jb = new JButton("Create Flash Cards");
      jb2 = new JButton("Review Flash Cards");
      jb3 = new JButton("See Questions");
      jb4 = new JButton("See Answers");
      jp.add(jb);
      jp.add(jb2);
      jp.add(jb3);
      jp.add(jb4);
      jb.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      jb4.addActionListener(this);
   }
   
   //creates flashcards and answers in an array based on how FlashCardCount();
   public void CreateFlashCardList(){
   
      
      
         setTitle("Create Flash Card");
         setSize(500, 500);
         setVisible(true);
         
         jp = new JPanel();
 
      for(int i = 0; i < question.length; i++){
         System.out.println("Please enter question "+(i+1));
         this.question [i] = input.nextLine();   
         
      }
      
      //repeats entered questions
      System.out.println("Your questions are:");
      for(int i = 0; i < question.length; i++){
         System.out.println(question[i]);
      }
      
      System.out.println();
      for(int b = 0; b < answer.length; b++){
         System.out.println("Please enter answer "+(b+1));
         this.answer[b] = input.nextLine();   
      }
      
      //repeats entered answers
      System.out.println("Your answers are:");
      for(int b = 0; b < answer.length; b++){
         System.out.println(answer[b]);
      }  
      
   }
   
   //allows user to check question of one previously entered
   public void getQuestion() {
       
      Scanner input = new Scanner(System.in);
      System.out.println(); 
      System.out.println("Which question would you like to look at?");
      int checkQ = input.nextInt()-1;
      input.nextLine();
      
      if (checkQ <= question.length - 1 && checkQ > -1){
         System.out.println("Question: " + question[checkQ]);
      } else {
         System.out.println("Invalid Input. Question does not exist.");
      }   
   }
   
   //allows user to check answer of one previously entered
   public void getAnswer() {
       
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("Which answer would you like to look at?");
      int checkA = input.nextInt()-1;
      input.nextLine();
      
      if (checkA <= answer.length - 1 && checkA > -1){
         System.out.println("Answer: " + answer[checkA]);
      } else {
         System.out.println("Invalid Input. Answer does not exist.");
      }
   }
   
   //Two Buttons to create and review
   public void actionPerformed (ActionEvent e){
            //If Create Button is pushed, call CreateFlashCard method
            if(e.getSource() == jb){
               CreateFlashCardList();
               
            //If Review Button is pushed, call ReviewFlashCard method
            }if(e.getSource() == jb2){
               reviewFlashCard(question, answer);
               
            //Calls the getQuestion method
            }if(e.getSource() == jb3){
               getQuestion();
               
            //Calls the getAnswer method
            }if(e.getSource() == jb4){
               getAnswer();
            }
      }
   public void reviewFlashCard (String[] question, String[] answer){
         
         for(int i = 0; i < question.length; i++){
         System.out.println(question[i]);
         String [] userAnswer = new String [answer.length];
         userAnswer[i] = input.nextLine();
         if( userAnswer[i].equals(answer[i]))
         {
            System.out.println("Correct");
         }else{
            System.out.println("Incorrect");
         }
      }
    }  
}
