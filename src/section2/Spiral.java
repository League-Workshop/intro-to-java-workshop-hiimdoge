package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot toby = new Robot();
		// 5. Set your robot's pen down 
		toby.penDown();
		// 3. Set the robot to go at max speed (100)
		toby.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int i = 0; i < 75; i ++) {
			// 7. Change the pen color to random
		    toby.setRandomPenColor();
		    // 8. Set the pen width to i
		 	toby.setPenWidth(i);
			// 6. Move the robot 5 times the loop counter (5*i)
			toby.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		    toby.turn(360/7);
		}
	
	}
}
