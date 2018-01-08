/*package a08;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class SnakeGame_7_22 extends JFrame {
	
	private final int WIDTH = 305;
	private final int HEIGHT = 307;
	private final int RAND_POS = 29;
	private final int DOT_SIZE = 10;
	private final int X_OFFSET = 2;
	private final int Y_OFFSET = 4;
	
	private Dir snakeDir = Dir.RIGHT;
	
	private boolean inGame = false;
	private int x, y;
	private int apple_x, apple_y;
	private int speed = DOT_SIZE;
	private int velX = 0;
	private int velY = 0;
	private int tailLength;
	private int score = 0;
	
	private Image head;
	private Image tail;
	private Image apple;
	
	private enum Dir {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	public class AL extends KeyAdapter {	
		//Handles keyboard input
		
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if(keyCode == KeyEvent.VK_LEFT && snakeDir != Dir.RIGHT) {
				snakeDir = Dir.LEFT;
				//System.out.println("LEFT");
			}
			if(keyCode == KeyEvent.VK_RIGHT && snakeDir != Dir.LEFT) {
				snakeDir = Dir.RIGHT;
				//System.out.println("RIGHT");
			}
			if(keyCode == KeyEvent.VK_UP && snakeDir != Dir.DOWN) {
				snakeDir = Dir.UP;
				//System.out.println("UP");
			}
			if(keyCode == KeyEvent.VK_DOWN && snakeDir != Dir.UP) {
				snakeDir = Dir.DOWN;
				//System.out.println("DOWN");
			}
		}
	}

	public SnakeGame_7_22() {
		
		setJFrameAttributes();

        ImageIcon iia = new ImageIcon("src/javaGame/images/snake/apple.png");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("src/javaGame/images/snake/head.png");
        head = iih.getImage();
        
        ImageIcon iid = new ImageIcon("src/javaGame/images/snake/dot.png");
	    tail = iid.getImage();
		
		generateAppleCoords();
		
		// snake x and y
		x = 100;
		y = 100;
		
		// start game
		inGame = true;
		
		do
		{
			sleep(100);
			
			// Reset velocity
			velX = 0;
			velY = 0;

			// Set the velocity using the direction
			setVelocity();
			
			checkAppleCollision();
			checkCollision();
			repaint();
			//System.out.printf("(%d,%d)%n", x, y);
			
		}while(inGame);
		
			System.out.println("*********************");
			System.out.println("GAME OVER");
			System.out.println("*********************");
			System.out.println("PLAYER1");
			System.out.printf("Final Score: %d%n", score);
			System.out.printf("Snake Length: %d%n", tailLength + 1);
			System.out.println("********************* ");
			this.dispose();
	}

	private void setJFrameAttributes() {
		addKeyListener(new AL());
		setTitle("Snake Game");
		setSize(WIDTH + 20, HEIGHT + 20);
		setResizable(false);
		setVisible(true);
		setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void setVelocity() {
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
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		if(inGame) {
			// reset the window background
			g.clearRect(0, 0, 600, 600 );
			// draw grid
			drawGrid(g);
			// draw apple
			g.drawImage(apple, apple_x, apple_y, this);
			// move the snake
			move();
			// draw the snake head
			g.setColor(Color.WHITE);
			g.fillOval(x + X_OFFSET, y + Y_OFFSET, DOT_SIZE, DOT_SIZE);
			
			Toolkit.getDefaultToolkit().sync();
            g.dispose();
			
		}
	}

	private void drawGrid(Graphics g) {
		for(int x = 0; x < 600; x += DOT_SIZE)
		{
			g.setColor(Color.GRAY);
			g.drawLine(x + X_OFFSET, 0 + Y_OFFSET, x + X_OFFSET, 600 + Y_OFFSET);
			g.drawLine(0 + X_OFFSET, x + Y_OFFSET, 600 + X_OFFSET, x + Y_OFFSET);
		}
	}
	
	public void move() {
		x += velX;
		y -= velY;
	}

	public void checkAppleCollision() {
	// if location of snake head is the same as the location of the apple,
	// increase the tailLength and place a new apple on screen
        if ((apple_x == x + + X_OFFSET)  && (apple_y == (y + Y_OFFSET))) {
        	tailLength++;
            score+= 100;
            generateAppleCoords();
        }
    }
	
	public void generateAppleCoords() {
		int r;
		// places apple in a random position
		System.out.printf("Score: %d%n", score);
		System.out.printf("Tail Length: %d%n", tailLength);
		
		apple_x = -10;
		apple_y = -10;
		
        while(apple_x < 10 || apple_x > WIDTH) {
	        r = (int) (Math.random() * RAND_POS);
	        apple_x = ((r * DOT_SIZE)) + X_OFFSET;
        }
        while (apple_y < 10 || apple_y > HEIGHT) {
			r = (int) (Math.random() * RAND_POS);
			apple_y = ((r * DOT_SIZE)) + Y_OFFSET;
		}
        
        
		System.out.printf("Apple Location: (%d,%d)%n%n", apple_x - X_OFFSET, apple_y - Y_OFFSET);
    }
	
	public void checkCollision() {
	//checking wall collision
		if (y > HEIGHT + 10) {
			inGame = false;
		}
		
		if (y == 10) {
			inGame = false;
		}
		
		if (x > WIDTH + 10) {
			inGame = false;
		}
		
		if (x < 0) {
			inGame = false;
		}

	}
	
	public void sleep(int ms) {
		try {
		    Thread.sleep(ms);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) {
	
		new SnakeGame_7_22();
	}
}
*/