/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A07
*******************************************************/

package a07;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

public class ListVsSetGui extends JFrame 
{

    private JPanel contentPane;

    private JMenuBar menuBar;
    private JMenuItem mntnListVsSet;
    private JMenuItem mntmDemo;
    private JMenuItem mntnExit;

    private JTextArea listVsSetTextArea;

    private JPanel demoControlPanel;
    private JLabel lblYourChoice;
    private JRadioButton rdbtnListElements;
    private JRadioButton rdbtnSetElements;

    private final ButtonGroup buttonGroup = new ButtonGroup();

    private JTextArea demoTextArea;

	private JRadioButton rdbtnAddElements;
    
    private static ListVsSetDemo demo; 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	
                try {
                    ListVsSetGui frame = new ListVsSetGui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ListVsSetGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 700, 450);
        
        demo = new ListVsSetDemo( new ColoredSquare(4, Color.BLUE), new ColoredSquare(8, Color.RED),
        new ColoredSquare(12, Color.YELLOW), new ColoredSquare(8, Color.RED), new ColoredSquare(6, Color.GREEN));

        createMenu();
        createListVsSetTextArea();
        createDemoControlPanel();
        createDemoTextArea();

        createContentPane();

    }

    private void createContentPane() {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.setFont(new Font("STKaiti", Font.PLAIN, 26));
        setContentPane(contentPane);
        contentPane.add(listVsSetTextArea, BorderLayout.CENTER);
        
    }
    

    private void createDemoTextArea() {
        demoTextArea = new JTextArea("");
        demoTextArea.setBackground(UIManager.getColor("TextField.light"));
        demoTextArea.setFont(new Font("STKaiti", Font.PLAIN, 16));
        demoTextArea.setMargin(new Insets(25, 25, 25, 25));
        demoTextArea.setForeground(new Color(0, 0, 0));
    }


    private void createDemoControlPanel() {
        demoControlPanel = new JPanel();
        demoControlPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        demoControlPanel.setLayout(new GridLayout(12, 1, 0, 0));

        lblYourChoice = new JLabel("Your Choice:");
        lblYourChoice.setFont(new Font("Kannada Sangam MN", Font.BOLD, 14));
        demoControlPanel.add(lblYourChoice);

        listElementsbtn();
        setElementsbtn();
        addbtn();
    }

	private void addbtn() {
		rdbtnAddElements = new JRadioButton("Add");
        rdbtnAddElements.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		demo.addElement(new ColoredSquare(10, Color.ORANGE));
        		demoTextArea.setText(String.format("%s", demo.getListElements().toString()));
        	}
        });
        demoControlPanel.add(rdbtnAddElements);
        buttonGroup.add(rdbtnAddElements);
        demoControlPanel.add(rdbtnAddElements);
	}

	private void setElementsbtn() {
		rdbtnSetElements = new JRadioButton("Set Elements");
        rdbtnSetElements.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		demoTextArea.removeAll();
        		demoTextArea.setText(demo.getSetElements().toString());
        	}
        });
        
        buttonGroup.add(rdbtnSetElements);
        demoControlPanel.add(rdbtnSetElements);
	}

	private void listElementsbtn() {
		rdbtnListElements = new JRadioButton("List Elements");
        rdbtnListElements.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		demoTextArea.removeAll();
        		demoTextArea.setText(demo.getListElements().toString()); 
        	}
        });

        buttonGroup.add(rdbtnListElements);
        demoControlPanel.add(rdbtnListElements);
	}

    private void createListVsSetTextArea() {
        listVsSetTextArea = new JTextArea(
                "The 2 main differences between interface List and Set are:\n1. List is ordered, searchable, and items are accessible from thier indices.\n2. Set does not contain duplicates and is not ordered.");
        listVsSetTextArea.setMargin(new Insets(25, 25, 25, 25));
        listVsSetTextArea.setForeground(new Color(255, 255, 255));
        listVsSetTextArea.setOpaque(true);
        listVsSetTextArea.setBackground(SystemColor.inactiveCaptionText);
        listVsSetTextArea.setFont(new Font("STKaiti", Font.PLAIN, 22));
    }

    private void createMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mntmDemo = new JMenuItem("Demo");
        mntmDemo.setFont(new Font("Kannada Sangam MN", Font.BOLD, 14));
        mntmDemo.setHorizontalAlignment(SwingConstants.CENTER);
        mntmDemo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                contentPane.removeAll();
                contentPane.add(demoControlPanel, BorderLayout.WEST);
                contentPane.add(demoTextArea, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });
        menuBar.add(mntmDemo);

        mntnListVsSet = new JMenuItem("List vs. Set");
        mntnListVsSet.setFont(new Font("Kannada Sangam MN", Font.BOLD, 14));
        mntnListVsSet.setHorizontalAlignment(SwingConstants.CENTER);
        mntnListVsSet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                contentPane.removeAll();
                contentPane.add(listVsSetTextArea, BorderLayout.CENTER);
                validate();
                repaint();
            }
        });
        menuBar.add(mntnListVsSet);

        mntnExit = new JMenuItem("Exit");
        mntnExit.setFont(new Font("Kannada Sangam MN", Font.BOLD, 14));
        mntnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		System.exit(0);
        	}
        });
        mntnExit.setHorizontalAlignment(SwingConstants.CENTER);
        menuBar.add(mntnExit);
    }

}
