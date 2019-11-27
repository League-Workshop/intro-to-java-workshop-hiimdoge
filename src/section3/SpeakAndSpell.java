package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"

	    	speak("Spell the word dog");
	    	String dog = JOptionPane.showInputDialog("Type here:");
	    	if (dog.equalsIgnoreCase("dog")) {
				JOptionPane.showMessageDialog(null, "Correct");
				speak("Spell the word happy");
		    	String happy = JOptionPane.showInputDialog("Type here:");
		    	if (happy.equalsIgnoreCase("happy")) {
					JOptionPane.showMessageDialog(null, "Correct");
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
				  } 
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
			  } 
	}
	{
		// 2. Catch the user's answer in a String
        
		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


