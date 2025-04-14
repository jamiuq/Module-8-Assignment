import javax.swing.JOptionPane;


public class Module_Eight_Assignment
{
   public static void main(String[] args)
   {
     String input;
     int questions;
     int missed;
     double minPassing;

     input = JOptionPane.showInputDialog("How many questions are on the exam?");
     questions = Integer.parseInt(input);

     input = JOptionPane.showInputDialog("How many questions did the student miss?");
     missed = Integer.parseInt(input);

     input = JOptionPane.showInputDialog("What is the minimum passing score?");
     minPassing = Integer.parseInt(input);

     PassFailExam exam = new PassFailExam(questions, missed, minPassing);
     JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + " points.\nThe exam score is " + exam.getScore() + ".\nThe exam grade is " + exam.getGrade() + ".");
   }
}
