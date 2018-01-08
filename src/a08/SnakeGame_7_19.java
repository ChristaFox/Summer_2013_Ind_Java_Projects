/*package a08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class SnakeGame_7_19 extends JFrame {
	
	private enum Dir
	{
		UP,
		DOWN,
		LEFT,
		RIGHT
	}
	
	private boolean inGame = false;
	
	int x, y;
	private Dir snakeDir = Dir.RIGHT;
	
	int speed = 10;
	int velX = 0;
	int velY = 0;
	
	int xOffset = 2;
	int yOffset = 4;
	
	public class AL extends KeyAdapter {	//Handles keyboard input
		
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if(keyCode == KeyEvent.VK_LEFT && snakeDir != Dir.RIGHT) {
				snakeDir = Dir.LEFT;
			}
			if(keyCode == KeyEvent.VK_RIGHT && snakeDir != Dir.LEFT) {
				snakeDir = Dir.RIGHT;
			}
			if(keyCode == KeyEvent.VK_UP && snakeDir != Dir.DOWN) {
				snakeDir = Dir.UP;
			}
			if(keyCode == KeyEvent.VK_DOWN && snakeDir != Dir.UP) {
				snakeDir = Dir.DOWN;
			}
		}
	}
	
	public SnakeGame_7_19() {
		addKeyListener(new AL());
		setTitle("JavaGame");
		setSize(305, 307);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// snake x and y
		x = 100;
		y = 100;
		
		// start game
		inGame = true;
		
		do
		{
			try {
			    Thread.sleep(100);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			// Reset velocity
			velX = 0;
			velY = 0;
			
			// Set the velocity using the direction
			switch(snakeDir)
			{
				case UP:
					velY = speed;
					break;
				case DOWN:
					velY = -speed;
					break;
				case LEFT:
					velX = -speed;
					break;
				case RIGHT:
					velX = speed;
					break;
			}
			
			paint(this.getGraphics());
			
		}while(inGame);
		
	}
	
	public void paint(Graphics g) {
		// reset the window background
		g.clearRect(0, 0, 600, 600 );
		
		// draw grid
		drawGrid(g);
		
		// step the snake
		x += velX;
		y -= velY;
		
		// draw the snake
		g.fillOval(x + xOffset, y + yOffset, 10, 10);
	}
	
	private void drawGrid(Graphics g)
	{
		for(int x = 0; x < 600; x += 10)
		{
			g.drawLine(x + xOffset, 0 + yOffset, x + xOffset, 600 + yOffset);
			g.drawLine(0 + xOffset, x + yOffset, 600 + xOffset, x + yOffset);
		}
	}
	
	public static void main(String[] args) {
		new SnakeGame_7_19();
	}
	
}


*/