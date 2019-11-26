package section3;

import javax.swing.JOptionPane;

public class Greeter {
	
    public static void main(String[] args) {
    	String name = JOptionPane.showInputDialog("what's your name???");
    	JOptionPane.showMessageDialog(null, "hi, " + name + ", have a good life!!");
	}
}
