package DP;

import java.awt.*;
import java.awt.event.InputEvent;

public class SynoFin {

	 public static void main(String[] args) {
	        try {
	            while (true) {

	                Robot robot = new Robot();
	                int button = InputEvent.BUTTON1_DOWN_MASK;
	                robot.mousePress(button);
	                Thread.sleep(400);
	                robot.mouseRelease(button);
	                Thread.sleep(2000 * 60);
	                System.out.println("Click");
	                
	                robot.mouseMove(600, 300);
//	                robot.mouseMove(300,600);


	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
