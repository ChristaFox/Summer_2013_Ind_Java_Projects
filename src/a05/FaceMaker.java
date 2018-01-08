/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A05
*******************************************************/

package a05;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FaceMaker extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FaceMaker() 
	{
		
		super("Christa's Face Maker");
		Face currentFace = new Face();
		FaceController myFaceController = new FaceController(currentFace);
		add(myFaceController, BorderLayout.WEST);
		GridLayout myLayout = new GridLayout(2,1);		
		setSize(1000, 1000);
		getFaceArea();

	}
    private JPanel getFaceArea() 
    {
    	Face myFace = new Face();
        myFace.setBackground(Color.CYAN);
        myFace.setOpaque(true);
        myFace.setForeground(Color.WHITE);
        myFace.setFont(new Font("Arial", Font.BOLD, 150));
        add(myFace);
        return myFace;
    }

}
