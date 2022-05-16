import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	//jelly rand vars
	int x1 = (int)(Math.random() * 601) + 100;
	
	//CREATE THE OBJECTS (STEP 1) 
	Background 	bg 	= new Background(0, 0);
	Squiddy squiddy = new Squiddy (50, 380);
	Jellyfish jelly1 = new Jellyfish (x1, 50);
	Patrick patty1 = new Patrick (150, 450);
	Patrick patty2 = new Patrick (500, 450);
	Spongebob spongy = new Spongebob (300, 450);
	KrabbyPatty coin1 = new KrabbyPatty(50, 20);
	KrabbyPatty coin2 = new KrabbyPatty(50, 450);
	
	//MUSIC
	Music soundJump = new Music("Mario-jump-sound.wav", false);
	Music soundDead = new Music("Pacman-death-sound_(1).wav", false);
	
	//intro screen 
	boolean gameStart = false;
	
	//coin disappearance
	boolean coinCollect = false; 
	
	//exit screen
	boolean gameEnd = false;
	
	//score 
	int score = 100;  
	
	//font
	Font f1 = new Font (Font.MONOSPACED, Font.PLAIN, 26);
	Font f2 = new Font (Font.DIALOG, Font.PLAIN, 26);
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		bg.paint(g);
		
		//bg if game end
	
		if(gameEnd) {
			g.setColor(Color.WHITE);
			g.setFont(f2);
			g.drawString("Score: " + score, 340, 230);
			g.drawString("BooHoo You Lost", 290, 280);
			g.drawString("ReRun the Game to Retry", 245, 330);
		return;
		} 
		
		//bg before game begins
		
		bg.paint(g);
		coin1.paint(g);
		coin2.paint(g);
		
		if(!gameStart) {
			g.setColor(Color.WHITE);
			g.setFont(f2);
			g.drawString("welcome. help material squiddy win", 187, 250);
			g.drawString("press enter to commence your pineapple under-the-sea adventure", 20, 300);
		return;
		} 
		
		bg.paint(g);
		squiddy.paint(g);
		jelly1.paint(g);
		patty1.paint(g);
		patty2.paint(g);
		
		//add rectangles
			Rectangle rsquiddy = new Rectangle (squiddy.x, squiddy.y, 50, 50);
			Rectangle rjelly = new Rectangle (jelly1.x1, jelly1.y1, 50, 50);
			Rectangle rpatty1 = new Rectangle (patty1.x2, patty1.y2, 50, 50);
			Rectangle rpatty2 = new Rectangle (patty1.x2, patty1.y2, 50, 50);


				
		//score
				g.setColor(Color.BLACK);
				g.setFont(f1);
				g.drawString("Score: " + score, 610, 90);
				

		// game instructions
				g.setColor(Color.WHITE);
				g.setFont(f2);
				g.drawString("press space to jump and proceed forward", 150, 30);

		//set collision
				if (rsquiddy.intersects(rpatty1) || rsquiddy.intersects(rpatty2) || rsquiddy.intersects(rjelly)) {
					score -= 3;
				}
		
		//end game
				if (score <= 0) {
					gameEnd = true;
					soundDead.play();
				}
				
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	public Frame() {
		JFrame f = new JFrame("Crossy Street");
		f.setSize(new Dimension(800, 600));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
			System.out.println(arg0.getKeyCode());
			
			squiddy.fall();
			
			//intro screen diss. when enter is pressed
			if (arg0.getKeyCode() == 10) {
				 gameStart = true;
				 
			}
			
			if (arg0.getKeyCode() == 40) {
				gameStart = false;
			}
			
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
			squiddy.jump();
			soundJump.play();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
