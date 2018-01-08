package a08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class LeaderBoard extends JFrame {

	private static final long serialVersionUID = -3420660017467532011L;
	private JPanel leaderBoard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaderBoard frame = new LeaderBoard();
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
	public LeaderBoard() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds(100, 100, (int)tk.getScreenSize().getWidth(), (int) tk.getScreenSize().getHeight());
		leaderBoard = new JPanel();
		leaderBoard.setForeground(Color.BLACK);
		leaderBoard.setBackground(Color.DARK_GRAY);
		leaderBoard.setBorder(new EmptyBorder(50, 50, 50, 50));
		setContentPane(leaderBoard);
		
		JLabel leaderBoardTitle = new JLabel();
		FlowLayout flowLayout = (FlowLayout) leaderBoardTitle.getLayout();
		leaderBoard.setLayout(new BorderLayout(0, 0));
		leaderBoard.add(leaderBoardTitle, BorderLayout.NORTH);
		leaderBoardTitle.setIcon(new ImageIcon(SnakeGui.class.getResource("/a08/snakeImages/crazyToungueSnake.png")));
		leaderBoardTitle.setBounds(0, 0, 100, 100);
		leaderBoardTitle.setFont(new Font("Marker Felt", Font.PLAIN, 40));
		leaderBoardTitle.setText("Snake High Scores");
		leaderBoardTitle.setForeground(Color.RED);
		leaderBoardTitle.setHorizontalAlignment(SwingConstants.CENTER);
		leaderBoardTitle.setBackground(Color.DARK_GRAY);
		
		JPanel highScoresList = new JPanel();
		leaderBoard.add(highScoresList, BorderLayout.SOUTH);
		highScoresList.setLayout(new GridLayout(5, 5, 5, 5));
	}

}

