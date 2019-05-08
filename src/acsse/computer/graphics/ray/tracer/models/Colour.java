/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

/**
 * @author SMG
 *
 */
public class Colour {

	private float red;
	private float green;
	private float blue;
	
	public Colour() {
		red = 0.0f;
		green = 0.0f;
		blue = 0.0f;
	}
	
	public Colour(float c) {
		red = green = blue = c;
	}
	
	public Colour (float red, float green, float blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public Colour(Colour other) {
		this.red = other.red;
		this.green = other.green;
		this.blue = other.blue;
	}
	
	public Colour add(final Colour c) {
		this.red += c.red;
		this.green += c.green;
		this.blue += c.blue;
		
		return this;
	}
	
	public Colour multiply(final float val) {
		this.red *= val;
		this.green *= val;
		this.blue *= val;
		
		return this;
	}
	
	public Colour multiply(final Colour c) {
		this.red *= c.red;
		this.green *= c.green;
		this.blue *= c.blue;
		
		return this;
	}
	
	public void clamp(float minVal, float maxVal) {
		red = Math.max(minVal, Math.min(maxVal, red));
		green = Math.max(minVal, Math.min(maxVal, green));
		blue = Math.max(minVal, Math.min(maxVal, blue));
	}
	
	public void performGammaCorrection(float exposure, float gamma) {
		red = (float) Math.pow(red * exposure, gamma);
		green = (float) Math.pow(green * exposure, gamma);
		blue = (float) Math.pow(blue * exposure, gamma);
	}
}
