import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class bot
{
    Robot robot = new Robot(); //creates a new object robot

  
  public bot() throws AWTException
  {
      robot.delay (400);
      robot.mouseMove(40, 130); //moves the mouse based on a x cor y cor placement
      robot.delay (400);
      robot.mouseMove (450,650);

      click();
      robot.delay(50);
    type("Your computer is hacked \n ");
    
    // robot.mouseMove(100,160);
    //  click();
   type("I have your social security number \n ");
     robot.delay(1000);// delays can be used so the typing isn't so quick
     
    type("Wire $2000 to me to stop this ");
    
  }
  
  private void click()
  {
      robot.mousePress(InputEvent.BUTTON1_MASK); //just presses and releases the left mouse
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
  }
  
    private void type(int i) //used to help type a int
  {
    robot.keyPress(i);
    robot.keyRelease(i);
  }

    private void type(String s) {  //used to help type a string
      byte[] b = s.getBytes(); //int the code for each character
      for (int i=0; i<b.length; i++){
	  int code = b[i];
      if (code > 96 && code < 123) code = code - 32; // keycode only handles a-z based on the ASCII code. \n work for some reason
      robot.delay (60);
      robot.keyPress(code); // 32 is subtracted to manage and make it all lower case
      robot.keyRelease(code);
    }
  }


    public static void main(String[] args) throws AWTException //exception needed for the robot if the mouse and keyboard fails, main method
  {
      new bot();
    
  }    
}
