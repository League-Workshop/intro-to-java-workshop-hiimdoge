package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot toby = new Robot();
		toby.sparkle();
		toby.penDown();
		toby.setSpeed(100);
		for(int i = 0; i < 4; i ++ ) {
			toby.move(100);
		    toby.turn(90);
		}
		toby.unSparkle();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		toby.penUp();
		toby.move(500);
		
	}
}
