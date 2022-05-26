import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class KrabbyPatty { 
	//add location attributes  
		public int x3 , y3;
		//position of the coins 
		private Image img;
		public int bvx1 = 4;
		private AffineTransform tx;
 
		public KrabbyPatty (int x, int y) {
			this.x3 = x; 
			this.y3 = y;
			img = getImage("/imgs/material_patty-removebg-preview.png"); //load the image for Tree

			tx = AffineTransform.getTranslateInstance(x, y );
			init(x, y); 				//initialize the location of the image
										//use your variables
		}
		
		
		
		public void changePicture(String newFileName) {  
			img = getImage(newFileName);
			init(x3, y3);       
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
			 x3 += bvx1;
			 
			 if (x3 > 800) {
				 x3 = 0;
			 }
			
			 tx.setToTranslation(x3, y3);
			tx.scale(.2, .2);
		}
		
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(1.0, 1.0);
		}
		
		

		private Image getImage(String path) {
			Image tempImage = null;
			try {
				URL imageURL = KrabbyPatty.class.getResource(path);
				tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return tempImage;
		}



}
