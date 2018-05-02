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
		type("Ab7");
		//exc();
		//back();

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
			System.out.println(code);
			if (code >= 65 && code <= 90){
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(code);
				robot.keyRelease(code);
			}
			else{
				robot.keyPress(code);
				robot.keyRelease(code);				
			}
		}
	}
	private void tab(){
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}
	private void esc(){
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}
	private void exc(){
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_1); 
		robot.keyRelease(KeyEvent.VK_SHIFT); 
		robot.keyPress(KeyEvent.VK_SHIFT);
	}	
	private void doublequote(){
		robot.keyPress(KeyEvent.VK_QUOTEDBL);
		robot.keyRelease(KeyEvent.VK_QUOTEDBL);
	}

	private void enter(){
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	private void back(){
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	//End Basic Components -----------------------------------------------------------



	public static void main (String[] args) throws AWTException {
		newbot mrRoboto = new newbot();

	}
}