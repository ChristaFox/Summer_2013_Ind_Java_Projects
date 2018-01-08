package a08;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.*;


public class SnakeGame_7_23 extends GameConsole {
	
	private final int WIDTH = 305;
	private final int HEIGHT = 327;
	private final int RAND_POS = 31;
	private final int DOT_SIZE = 10;
	private final int X_OFFSET = 2;
	private final int Y_OFFSET = 4;
	private final int X_MIN = 0;
	private final int X_MAX = 290;
	private final int Y_MIN = 20;
	private final int Y_MAX = 310;
	
	private enum Dir {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	private Dir snakeDir = Dir.UP;
	
	private boolean inGame = false;
	private int x, y;
	private int appleX, appleY;
	private int speed = DOT_SIZE;
	private int velX = 0;
	private int velY = 0;
	private int tailLength;
	private int score = 0;
	private Random rand = new Random();
	
	private Image head;
	private Image tail;
	private Image apple;

	public SnakeGame_7_23() {
		
		setJFrameAttributes();

        ImageIcon appleIcon = new ImageIcon("src/snakeImages/apple.png");
        apple = appleIcon.getImage();

        ImageIcon headIcon = new ImageIcon("src/snakeImages/head.png");
        head = headIcon.getImage();
        
        ImageIcon tailIcon = new ImageIcon("src/snakeImages/dot.png");
	    tail = tailIcon.getImage();
		
		// Starting Snake x and y Pixel Coordinates
		x = 140;
		y = 160;
		
		generateAppleCoords();
		
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

	public class AL extends KeyAdapter {	
		
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
	
	private void setJFrameAttributes() {
		
		addKeyListener(new AL());
		setTitle("Snake Game");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
		setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private int getXCoord(int xPixelCoord) {
		
		return xPixelCoord / 10 + 1;
	}
	
	private int getYCoord(int yPixelCoord) {
		
		return yPixelCoord / 10 - 1;
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
			//drawGrid(g);
			// draw apple
			g.drawImage(apple, appleX, appleY, this);
			// move the snake coordinates
			move();
			// draw the snake head
			//g.setColor(Color.WHITE);
			//g.fillOval(x + X_OFFSET, y + Y_OFFSET, DOT_SIZE, DOT_SIZE);
			
			g.drawImage(head, x + X_OFFSET, y + Y_OFFSET, this);
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
	
	private void move() {
		
		x += velX;
		y -= velY;
	}

	private void checkAppleCollision() {
		
        if ((appleX == x + X_OFFSET)  && (appleY == (y + Y_OFFSET))) {
        	tailLength++;
            score += 100;
            generateAppleCoords();
        }
    }
	
	private void generateAppleCoords() {
		
		int xMin = 0;
		int yMin = 2;//
		
		int xMax = RAND_POS;
		int yMax = RAND_POS;
		
		int xRange = xMax - xMin + 1;
		int yRange = yMax - yMin + 1;
		
		int randNum  = rand.nextInt(xRange) + xMin;
        appleX = randNum * DOT_SIZE + X_OFFSET;
        
        randNum  = rand.nextInt(yRange) + yMin;
		appleY = randNum * DOT_SIZE + Y_OFFSET;
		
		printScoreData();
    }

	private void printScoreData() {
		
		System.out.printf("Head Location: (%d,%d)%n", getXCoord(x), getYCoord(y));
		System.out.printf("Score: %d%n", score);
		System.out.printf("Tail Length: %d%n", tailLength);
		System.out.printf("Next Apple Location: (%d,%d)%n%n", getXCoord(appleX - X_OFFSET), getYCoord(appleY - Y_OFFSET));
	}
	
	private void checkCollision() {
		
		if (x > X_MAX) {
			inGame = false;
		}
		
		if (x < X_MIN) {
			inGame = false;
		}
		
		if (y > Y_MAX) {
			inGame = false;
		}
		
		if (y < Y_MIN) {
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
	
		new SnakeGame_7_23();
	}
}
