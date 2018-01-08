/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A05
*******************************************************/

package a05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class FaceController extends JPanel
{
	//feilds
	private Face currentFace = new Face();
	private JCheckBox eyesCheckBox = new JCheckBox("Eyes");
	private JCheckBox noseCheckBox = new JCheckBox("Nose");
	private JCheckBox mouthCheckBox = new JCheckBox("Mouth");
	private JButton updateFace = new JButton("Update Face");
	
	//ctors
	public FaceController(Face c) 
	{
		c = currentFace;
        setLayout(new GridLayout(4, 1));
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(500, getHeight()));

        add(eyesCheckBox);
        eyesCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		add(noseCheckBox);
		noseCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		add(mouthCheckBox);
		mouthCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		setUpdateFace(getUpdateFace());
		
	}
	
	//methods
    private JButton getUpdateFace() 
    {
        JButton updateFace = new JButton("Update Face");
        updateFace.setBackground(Color.CYAN);
        add(updateFace);
        return updateFace;
    }
    
    public JCheckBox getEyesCheckBox()
    {
    	return eyesCheckBox;
    }
    
    public JCheckBox getNoseCheckBox()
    {
    	return noseCheckBox;
    }
    
    public JCheckBox getMouthCheckBox()
    {
    	return mouthCheckBox;
    }

	public void setUpdateFace(JButton updateFace) 
	{
		this.updateFace = updateFace;
	}
    
}
