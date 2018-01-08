/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A05
*******************************************************/

package a05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Arrays;

import javax.swing.*;

public class Face extends JPanel
{
	//feilds
	private ImageIcon faceImages1 = new ImageIcon ();
	private ImageIcon faceImages2 = new ImageIcon ();
	private ImageIcon faceImages3 = new ImageIcon ();
	private final ImageIcon[] faceImages = {faceImages1, faceImages2, faceImages3};
	
	private ImageIcon eyesImages1 = new ImageIcon ();
	private ImageIcon eyesImages2 = new ImageIcon ();
	private ImageIcon eyesImages3 = new ImageIcon ();
	private final ImageIcon[] eyesImages = {eyesImages1, eyesImages2, eyesImages3};
	
	private ImageIcon noseImages1 = new ImageIcon ();
	private ImageIcon noseImages2 = new ImageIcon ();
	private ImageIcon noseImages3 = new ImageIcon ();	
	private final ImageIcon[] noseImages = {noseImages1, noseImages2, noseImages3};
	
	private ImageIcon mouthImages1 = new ImageIcon ();
	private ImageIcon mouthImages2 = new ImageIcon ();
	private ImageIcon mouthImages3 = new ImageIcon ();
	private final ImageIcon[] mouthImages = {mouthImages1, mouthImages2, mouthImages3};
	
	private ImageIcon face;
	private ImageIcon eyes;
	private ImageIcon nose;
	private ImageIcon mouth;
	
	private int faceCounter;
	private int eyesCounter;
	private int noseCounter;
	private int mouthCounter;

	//ctors
	public Face() 
	{
		setSize(500, 500);
		setBackground(Color.cyan);
		face = faceImages1;
		eyes = eyesImages1;
		nose = noseImages1;
		mouth = mouthImages1;
	}
	
	//methods
	public void paintComponent(Graphics g)
	{
	    // paint background
	    super.paintComponent(g);
	  
	    // get width and height of drawing area
	    int height = getHeight();
	    int width  = getWidth();
	    
	    // draw face that takes up 80% of the JPanel
	    int faceTop  = height/10;
	    int faceLeft = width/10;
	    int faceHeight = height - height/5;
	    int faceWidth  = width  - width/5;
	    
	    // outline
	    g.setColor(Color.yellow);
	    g.fillOval(faceLeft, faceTop, faceWidth, faceHeight);
	    
	    // eyes
	    g.setColor(Color.black);
	    g.fillOval(faceLeft+(int)(width*0.2), faceTop+(int)(height*0.2),
	                width/10, height/10);
	    g.fillOval(faceLeft+(int)(width*0.5), faceTop+(int)(height*0.2),
	                width/10, height/10);
	    
	    // nose
	    Polygon nose = new Polygon();
	    nose.addPoint(faceLeft+(int)(width*0.40), faceTop+(int)(height*0.35));
	    nose.addPoint(faceLeft+(int)(width*0.45), faceTop+(int)(height*0.50));
	    nose.addPoint(faceLeft+(int)(width*0.35), faceTop+(int)(height*0.50));
	    g.fillPolygon(nose);
	    
	    // mouth
	    g.fillArc(faceLeft+(int)(width*0.25), faceTop+(int)(height*0.5),
	               (int)(width*0.3), (int)(height*0.2), 0, -180);
	    
	  }
	
	private void update(boolean eyesChecked, boolean noseChecked, boolean mouthChecked)
	{

	}
}
