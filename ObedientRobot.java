package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot boby = new Robot();

	void settings() {
		boby.penDown();
		boby.setSpeed(100);
		boby.setRandomPenColor();
		boby.setPenWidth(1);
		boby.setPos(new Random().nextInt(500) + 100, new Random().nextInt(300) + 100);
	}

	void circle() {
		settings();
		for (int i = 0; i < 360; i++) {
			boby.move(10);
			boby.turn(10);
		}
		
		boby.hide();
	}

	void square() {
		settings();
		for (int i = 0; i < 4; i++) {
			boby.move(100);
			boby.turn(90);
		}
		
		boby.hide();
	}

	void triangle() {
		settings();
		for (int i = 0; i < 3; i++) {
			boby.move(90);
			boby.turn(120);
		}
		
		boby.hide();
	}
	
	static void draw(int number) {
		if (number == 0)
			new ObedientRobot().circle();
		else if (number == 1)
			new ObedientRobot().square();
		else if (number == 2)
			new ObedientRobot().triangle();
		else
			System.exit(0);
	}

	public static void main(String[] args) {

		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
		
		
		
			int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
			draw(shape);
			

	}

}
