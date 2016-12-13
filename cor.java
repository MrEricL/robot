import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class a {
    
  public static void main(String[] args) throws InterruptedException{
      int i=0;
    while(true && i<5){
      //Thread.sleep(100);
	i+=1;
      System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
              ", " + 
              MouseInfo.getPointerInfo().getLocation().y + ")");
    }
  }
}
