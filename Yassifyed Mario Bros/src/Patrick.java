import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Patrick {
	//add location attributes
		public int x1 , y1;
		//position 
		private Image img;
		private AffineTransform tx;

		public Patrick(int x, int y) {
			this.x1 = x;
			this.y1 = y;
			img = getImage("/imgs/emogworlpatty.png"); //load the image for Tree

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
			tx.setToTranslation(x1, y1);
			tx.scale(1.2, 1.2);
		}
		
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(1.2, 1.2);
		}
		
		

		private Image getImage(String path) {
			Image tempImage = null;
			try {
				URL imageURL = Patrick.class.getResource(path);
				tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return tempImage;
		}



}
