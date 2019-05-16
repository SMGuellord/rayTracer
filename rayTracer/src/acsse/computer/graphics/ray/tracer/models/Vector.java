package acsse.computer.graphics.ray.tracer.models;

public class Vector {
	
	private float x;
	private float y;
	private float z;
	
	/**
	 * Parameterless constructor
	 */
	public Vector () {

		this.x = 0.0f;
		this.y = 1.0f;
		this.z = 0.0f;
	}
	
	/**
	 * Parameterized constructor.
	 * 
	 */
	public Vector (float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Copy constructor
	 * @param otherVector original vector.
	 */
	public Vector (Vector otherVector){
		this.x = otherVector.x;
		this.y = otherVector.y;
		this.z = otherVector.z;
	}

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public float getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(float z) {
		this.z = z;
	}	
	
	/**
	 * @return vector
	 */
	public String toString() {
		return String.format("["+x+", "+y+", "+z+"]");
	}

}
