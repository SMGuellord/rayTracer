/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

/**
 * @author SMG
 *
 */
public class Vector2D {
	
	private float u;
	private float v;
	
	public Vector2D() {
		this.u = 0.0f;
		this.v = 0.0f;
	}
	
	/**
	 * @return the u
	 */
	public float getU() {
		return u;
	}

	/**
	 * @param u the u to set
	 */
	public void setU(float u) {
		this.u = u;
	}

	/**
	 * @return the v
	 */
	public float getV() {
		return v;
	}

	/**
	 * @param v the v to set
	 */
	public void setV(float v) {
		this.v = v;
	}

	public Vector2D (final Vector2D vec) {
		this.u = vec.u;
		this.v = vec.v;
	}
	
	public Vector2D (float u, float v) {
		this.u = u;
		this.v = v;
	}
}
