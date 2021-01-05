package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot jeff = new Robot ();
	
public void run() {
jeff.setSpeed(500);
jeff.setX(50);
jeff.setY(500);
jeff.penDown();
Random rando = new Random();
for (int i = 0; i<10;i++) {
	int size = rando.nextInt(3);
	if (size == 0) {
	house ("small")	;
	}
	else if (size == 1 ) {
		house ("medium");
	}
	else {
		house ("large");
	}
}

jeff.hide();
	}
	
void house (int height ) {
	jeff.setAngle(0);
	jeff.setRandomPenColor();
	jeff.move(height);
	jeff.turn(90);
	jeff.move(50);
	jeff.turn(90);
	jeff.move(height);
	jeff.turn(270);
	jeff.setPenColor(0, 200, 0);
	jeff.move(20);	
	
	}
void house (String height ) {
if (height.equals("small")) {
house (60);
}
else if (height.equals("medium")) {
house (120);
}
else {
	house (250);
}
}
}

