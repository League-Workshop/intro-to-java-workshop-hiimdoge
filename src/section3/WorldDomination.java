package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String codeYesNo = JOptionPane.showInputDialog("Do you know how to write code???");
		if (codeYesNo.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "US CODERS WILL RULE THE WORLD!!!!!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "have fun washing dishes lol...");
		  } 

			
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

