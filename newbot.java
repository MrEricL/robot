// Impots
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import cs1.Keyboard;
import java.io.*;
import java.util.*;

public class newbot {

	Robot robot = new Robot();

	private double delayTime = 1; //Delay time 2s for start
	private double delayTimeFunction = 0.5; //Delay time 1s per action

	public newbot() throws AWTException {
		delayed(delayTime);
		click();
		type("hi");

	}


	//Basic Components ----------------------------------------------------------------
	private void delayed(double secs){
		int ms = (int) secs*1000;
		robot.delay(ms);
	}
	private void click(){
		robot.mousePress(InputEvent.BUTTON1_MASK); //just presses and releases the left mouse
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	//used to help type a int
	private void type(int i){
		robot.keyPress(i);
		robot.keyRelease(i);
	}
	//used to help type a string
	private void type(String s) { 
		byte[] b = s.getBytes(); 
		for (int i=0; i<b.length; i++){
			int code = b[i];
			if (code > 96 && code < 123) code = code - 32; // only handles a-z from ASCII code.
			robot.delay (60);
			robot.keyPress(code);
			robot.keyRelease(code);
		}
	}

	private void enter(){
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	private void back(){
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
	}
	//End Basic Components -----------------------------------------------------------



	public static void main (String[] args) throws AWTException {
		newbot mrRoboto = new newbot();

	}
}