import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class cor {

  public static void printCor(){
      int i=0;
      while(true && i<5){
      //Thread.sleep(100);
        i+=1;
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                          ", " + 
                          MouseInfo.getPointerInfo().getLocation().y + ")");
    }
  }

  public static void main(String[] args) throws InterruptedException{
    while (true){
      System.out.println("Enter 1 to get cor at current position, 0 to quit\n");
        try {
          //Parse Terminal
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int i = Integer.parseInt(br.readLine());
          //Check for input
          if (i == 1){
                  int x=0;
                  while(true && x<5){
                  //Thread.sleep(100);
                    x+=1;
                    System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                                      ", " + 
                                      MouseInfo.getPointerInfo().getLocation().y + ")");
                }
          }
          else{
            break;
          }
        }
        catch ( IOException e ) { }
    }

  }
}
