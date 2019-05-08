/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

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
	
}
