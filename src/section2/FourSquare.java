package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot toby = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		toby.setSpeed(100);
		// 5. Set the pen width to 5
        toby.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
        for(int i = 0; i < 4; i ++); {
			// 7. Set the pen color to random
	        toby.setRandomPenColor();
			// 8. Turn the robot 90 degrees to the right
        	toby.turn(90);
        }
			// 1. Call the drawSquare() method
	        drawSquare();

	}

	
	void drawSquare() {
		/* 3. Fill in the code to draw a square inside the method below. */
		toby.sparkle();
		toby.penDown();
		toby.setSpeed(100);
		for(int i = 0; i < 4; i ++ ) {
			toby.move(100);
		    toby.turn(90);
		    
		}
		toby.penUp();
		toby.unSparkle();
		toby.move(1000);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



