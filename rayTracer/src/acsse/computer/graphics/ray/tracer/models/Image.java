/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * @author SMG
 *
 */
public class Image {

	private int imgWidth;
	private int imgHeight;
	private Colour[][] data;
	
	
	public Image(int imgWidth, int imgHeight) {
		this.imgWidth = imgWidth;
		this.imgHeight = imgHeight;
		
		data = new Colour[imgWidth][imgHeight];
		
	}
	
	public Image(Image other) {
		this.imgWidth = other.imgWidth;
		this.imgHeight = other.imgHeight;
		
		for(int w = 0; w < other.imgWidth; w++) {
			for(int h = 0; h < other.imgHeight; h++) {
				data[w][h] = other.getPixel(w, h);
			}
		}
	}
	
	
	/**
	 * @return the imgWidth
	 */
	public int getImgWidth() {
		return imgWidth;
	}
	/**
	 * @param imgWidth the imgWidth to set
	 */
	public void setImgWidth(int imgWidth) {
		this.imgWidth = imgWidth;
	}
	/**
	 * @return the imgHeight
	 */
	public int getImgHeight() {
		return imgHeight;
	}
	/**
	 * @param imgHeight the imgHeight to set
	 */
	public void setImgHeight(int imgHeight) {
		this.imgHeight = imgHeight;
	}
	
	public Colour getPixel(int x, int y) {
		
		return data[x][y];
	}
	
	public void setPixel(int x, int y, Colour colour) {
		this.data[x][y] = new Colour(colour);
	}
	
	
	public void saveimage(String filename, float exposure, float gamma) {
		
		File image = new File(filename);
		BufferedImage buffer = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
		long starts = System.nanoTime();
		for (int w = 0; w < imgWidth; w++) {
			for(int h = 0; h < imgHeight; h++) {
				Colour thisColour = new Colour(this.data[w][h]);
				thisColour.performGammaCorrection(exposure, gamma);
				thisColour.clamp(0.0f, 1.0f);
				buffer.setRGB(w, h, thisColour.toInteger());
			}
		}
		try {
		ImageIO.write(buffer, "PNG", image);
		} catch(Exception e) {
			System.out.println("Image could not be writen");
			System.exit(1);
		}
		
		long end = System.nanoTime();
		System.out.println("Loop time: "+ (end-starts));
	}
}
