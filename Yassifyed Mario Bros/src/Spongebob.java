import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Spongebob extends Patrick {
	//add location attributes
		public int x4 , y4;
		//position 
		private Image img;
		private AffineTransform tx;

		public Spongebob (int x, int y) {
			super(x , y);
			this.x4 = x;
			this.y4 = y;
			img = getImage("/imgs/fully yassified spongy.png"); //load the image for Tree
			//use your variables
		}
		
		
		
		
		public void changePicture(String newFileName) {
			img = getImage(newFileName);
			init(x4, y4);        
		}
		
		public void paint(Graphics g) {
			//these are the 2 lines of code needed draw an image on the screen
			Graphics2D g2 = (Graphics2D) g;

			//call update to update the actual picture location
			update();
			g2.drawImage(img, tx, null);

		}
		/* update the picture variable location */
		
		
		
		private void update() {
			tx.setToTranslation(x4, y4);
			tx.scale(0.2, 0.2);
		}
		
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(1.6, 1.6);
		}
		
		

		private Image getImage(String path) {
			Image tempImage = null;
			try {
				URL imageURL = Spongebob.class.getResource(path);
				tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return tempImage;
		}



}
