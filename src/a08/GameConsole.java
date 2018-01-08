package a08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class GameConsole extends JFrame {

	private JPanel gameConsole;
	private int xSize;
	private int ySize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameConsole frame = new GameConsole();
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
	public GameConsole() {
		getContentPane().setBackground(Color.DARK_GRAY);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		Toolkit tk = Toolkit.getDefaultToolkit();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, xSize = ((int) tk.getScreenSize().getWidth()), ySize = ((int) tk.getScreenSize().getHeight())
);
		gameConsole = new JPanel();
		gameConsole.setForeground(new Color(0, 0, 0));
		gameConsole.setBorder(new EmptyBorder(5, 5, 5, 5));
		gameConsole.setLayout(new BorderLayout(0, 0));
		setContentPane(gameConsole);
		
		JPanel gameFrame = new JPanel();
		gameFrame.setBackground(Color.DARK_GRAY);
		gameConsole.add(gameFrame, BorderLayout.CENTER);
		gameFrame.setLayout(new BorderLayout(50, 50));
		gameConsole.setBorder(new EmptyBorder(50, 50, 50, 50));
		gameConsole.add(new SnakeGame_7_23());
	}

}
