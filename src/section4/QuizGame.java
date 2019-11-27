package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question
		String q1 = JOptionPane.showInputDialog("True or false, turtles can breath out of their butts?");
		// 3.  Use an if statement to check if their answer is correct
		if (q1.equalsIgnoreCase("true")) {
			JOptionPane.showMessageDialog(null, "Correct!!");
            score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!!");
		}
		String q2 = JOptionPane.showInputDialog("True or false, LOL stands for lots of love?");
		if (q2.equalsIgnoreCase("false")) {
			JOptionPane.showMessageDialog(null, "Correct!!");
            score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect (grandma)!!");
		}
		String q3 = JOptionPane.showInputDialog("True or false, Java is the best programming language?");
		if (q3.equalsIgnoreCase("true")) {
			JOptionPane.showMessageDialog(null, "Correct (duh)!!");
            score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect (DIRTY PYTHON FAN)!!");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score + "/3");
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
