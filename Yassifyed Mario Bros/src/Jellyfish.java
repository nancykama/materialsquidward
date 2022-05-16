import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Jellyfish {
	//add location attributes
		public int x1 , y1; 
		//position 
		private Image img;
		public int bvy1 = 4;
		private AffineTransform tx;

		public Jellyfish (int x, int y) {
			this.x1 = x;
			this.y1 = y;
			img = getImage("/imgs/jellyfish (2).gif"); //load the image for Tree

			tx = AffineTransform.getTranslateInstance(x, y );
			init(x, y); 				//initialize the location of the image
										//use your variables
		}
		
		
		
		public void changePicture(String newFileName) {
			img = getImage(newFileName);
			init(x1, y1);       
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
			 y1+= bvy1; 
			 
			 if (y1 > 600) {
				 y1 = 0; 
			 }
			
			 tx.setToTranslation(x1, y1);
			tx.scale(.2, .2);
		}
		
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(0.4, 0.4);
		}
		
		

		private Image getImage(String path) {
			Image tempImage = null;
			try {
				URL imageURL = Jellyfish.class.getResource(path);
				tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return tempImage;
		}



}
