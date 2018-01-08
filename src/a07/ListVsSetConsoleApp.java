/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A07
*******************************************************/

package a07;

import java.awt.Color;

public class ListVsSetConsoleApp {

    public static void main(String[] args) 
    {
          // notice: I pass the individual elements, // because the constructor is implemented with varargs
          ListVsSetDemo demo = new ListVsSetDemo( new ColoredSquare(4, Color.BLUE), new ColoredSquare(8, Color.RED),
          new ColoredSquare(12, Color.YELLOW), new ColoredSquare(8, Color.RED), new ColoredSquare(6, Color.GREEN));
          
          System.out.println("List:\n" + demo.getListElements()); System.out.println("Set:\n" + demo.getSetElements());
          
          System.out.println("\nAdding a new element:"); demo.addElement(new ColoredSquare(10, Color.ORANGE));
          System.out.println("List:\n" + demo.getListElements()); 
          System.out.println("Set:\n" + demo.getSetElements());
 
          System.out.println("\nAdding a duplicate element:"); demo.addElement(new ColoredSquare(10, Color.ORANGE));
          System.out.println("List:\n" + demo.getListElements()); System.out.println("Set:\n" + demo.getSetElements());
         
    }

}
