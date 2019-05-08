/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

/**
 * @author MG Sumba
 *
 */
public class Ray {
	
	private final float T_MIN = 0.0001f;
	private final float T_MAX = 1.0e30f;
	
	private Vector pOrigin; //ray starting point
	private Vector dir; // direction of the ray
	private float tMax; // maximum distance of the ray
	
	
	public Ray() {
		pOrigin = new Vector(0.0f, 0.0f, 0.0f);
		dir = new Vector();
		tMax = T_MAX;
	}
	
	/**
	 * @param pOrigin
	 * @param dir
	 * @param tMax
	 */
	public Ray(final Vector pOrigin, final Vector dir) {
		super();
		this.pOrigin = pOrigin;
		this.dir = dir;
		this.tMax = T_MAX;
	}
	
	public Ray(final Ray other) {
		this.pOrigin = other.pOrigin;
		this.dir = other.dir;
		this.tMax = other.tMax;
	}
	/**
	 * @return the t_MIN
	 */
	public float getT_MIN() {
		return T_MIN;
	}
	
	/**
	 * @return the t_MAX
	 */
	public float getT_MAX() {
		return T_MAX;
	}
	
	/**
	 * @return the pOrigin
	 */
	public Vector getpOrigin() {
		return pOrigin;
	}
	/**
	 * @param pOrigin the pOrigin to set
	 */
	public void setpOrigin(Vector pOrigin) {
		this.pOrigin = pOrigin;
	}
	/**
	 * @return the dir
	 */
	public Vector getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(Vector dir) {
		this.dir = dir;
	}
	/**
	 * @return the tMax
	 */
	public float gettMax() {
		return tMax;
	}
	/**
	 * @param tMax the tMax to set
	 */
	public void settMax(float tMax) {
		this.tMax = tMax;
	}
	
	final Vector calculate(float t) {
		
		return MathClass.add(pOrigin, Transforms.scale(t, dir));
	}
	

}
