package a08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Component;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Rectangle;
import java.awt.Point;

public class SnakeGui extends JFrame {

	private static final long serialVersionUID = -2876525438319381607L;
	private JPanel frontContentPane;
	private JButton btnExitButton;
	private JButton btnStartButton;
	private JButton btnLeaderBoardButton;
	private JPanel control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnakeGui frame = new SnakeGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SnakeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		frontContentPane = new JPanel();
		frontContentPane.setForeground(Color.BLUE);
		frontContentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(frontContentPane);
		
		JPanel title = new JPanel();
		title.setBackground(Color.DARK_GRAY);
		
		
		createButtonsBar(title);
	}

	private void createButtonsBar(JPanel title) {
		JPanel buttonsBar = new JPanel();
		buttonsBar.setLocation(new Point(50, 400));
		buttonsBar.setBounds(new Rectangle(50, 400, 500, 100));
		buttonsBar.setLayout(new GridLayout(0, 3, 0, 0));
		Component lblSnake = null;
		frontContentPane.setLayout(new BorderLayout(0, 0));
		frontContentPane.add(title);
		title.setLayout(new BorderLayout(0, 0));
		
		createSnakeFrame(title, buttonsBar);
		
		JPanel leftBorder = new JPanel();
		leftBorder.setBackground(Color.DARK_GRAY);
		buttonsBar.add(leftBorder);
		leftBorder.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		control = new JPanel();
		control.setBackground(Color.DARK_GRAY);
		buttonsBar.add(control);
		control.setLayout(new GridLayout(3, 0, 0, 0));
		
		btnStartButton = new JButton("Start");
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GameConsole frame = new GameConsole();
					frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			
			}
		});
		btnStartButton.setBackground(Color.CYAN);
		btnStartButton.setForeground(Color.BLACK);
		control.add(btnStartButton);
		
		btnLeaderBoardButton = new JButton("Leader Board");
		btnLeaderBoardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LeaderBoard frame = new LeaderBoard();
					frame.setVisible(true);
				} catch (Exception exc) {
					exc.printStackTrace();
				}
			}
		});
		control.add(btnLeaderBoardButton);
		
		btnExitButton = new JButton("Exit");
		control.add(btnExitButton);
		
		JPanel rightBorder = new JPanel();
		buttonsBar.add(rightBorder);
		rightBorder.setBackground(Color.DARK_GRAY);
		rightBorder.setLayout(new BorderLayout(0, 0));
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		frontContentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{title, lblSnake, buttonsBar, btnStartButton, btnLeaderBoardButton, btnExitButton}));
	}

	private void createSnakeFrame(JPanel title, JPanel buttonsBar) {
		JLabel lblSnake1 = new JLabel("Snake");
		title.add(lblSnake1);
		lblSnake1.setIcon(new ImageIcon(SnakeGui.class.getResource("/a08/snakeImages/crazyToungueSnake.png")));
		lblSnake1.setBounds(0, 0, 100, 50);
		lblSnake1.setFont(new Font("Marker Felt", Font.PLAIN, 40));
		lblSnake1.setForeground(Color.RED);
		lblSnake1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnake1.setBackground(Color.DARK_GRAY);
		frontContentPane.add(buttonsBar, BorderLayout.SOUTH);
	}

}
