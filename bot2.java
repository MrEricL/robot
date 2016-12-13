import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import cs1.Keyboard;

public class bot2
{
    Robot robot = new Robot(); //creates a new object robot
    // FUNCTIONALITY OF THE ROBOT  ____________________________________________________________________________________________________
    public void ircbot (String x){
	robot.delay(400);
	robot.mouseMove(441,825);
	click();
	type(x);
	robot.mouseMove(1377,855);
	click();
    }
    

    public void refresh(){
	robot.mouseMove (352,82);
	click();

    }
    //goes to a website
    public void web(String x){
	click();
	robot.mouseMove (585, 76);
	click();
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	type (x);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(500);

    }

    public void google(String x){
	robot.delay(7000);
	robot.mouseMove(780,450);
	click();
	type(x);
	robot.keyPress(KeyEvent.VK_ENTER);	

    }
    //_____________________________________________________________________________________________________________________________________





    

    // IMPORTANT PART ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public bot2() throws AWTException
    { String search="";
	//robot.delay(1000);
      ircbot("You suck");
      refresh();
    
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~





    

    //BASIC FUNCTIONALITY -----------------------------------------------------------------------------------------------------------------
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

    //-------------------------------------------------------------------------------------------------------------------------------------


    //MAIN METHOD
    public static void main(String[] args) throws AWTException //exception needed for the robot if the mouse and keyboard fails, main method
  {
      new bot2();
    
  }    
}
