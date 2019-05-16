/**
 * 
 */
package acsse.computer.graphics.ray.tracer.objects;

import acsse.computer.graphics.ray.tracer.models.MathClass;
import acsse.computer.graphics.ray.tracer.models.Ray;
import acsse.computer.graphics.ray.tracer.models.Transforms;
import acsse.computer.graphics.ray.tracer.models.Vector;
import acsse.computer.graphics.ray.tracer.models.Vector2D;

/**
 * @author SMG
 *
 */
public class PerspectiveCamera extends Camera {
	
	private Vector origin;
	private Vector forwardVector;
	private Vector upVector;
	private Vector rightVector;
	
	float height, width;
	
	
	public PerspectiveCamera(Vector origin, Vector target, Vector upguide, float angle, float aspectRation) {
		this.origin = new Vector(origin);
		this.forwardVector = new Vector(MathClass.normalize(new Vector(MathClass.sub(target, origin))));
		this.rightVector = new Vector(MathClass.normalize(new Vector(MathClass.crossProd(forwardVector, upguide))));
		this.upVector = new Vector(MathClass.crossProd(rightVector, forwardVector));
		
		height = (float) Math.tan(angle);
		width = height * aspectRation;
	}
	
	final public Ray produceRay(Vector2D point) {
		
		Vector pRight = new Vector(Transforms.scale(point.getU()*width, rightVector));
		Vector pUp = new Vector(Transforms.scale(point.getV() * height, upVector));		
		Vector vecSum = new Vector(MathClass.add(forwardVector, pRight));
		Vector dir = new Vector(MathClass.add(vecSum, pUp));
				
		return new Ray(origin, MathClass.normalize(dir));
	}

	/**
	 * @return the origin
	 */
	public Vector getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Vector origin) {
		this.origin = new Vector(origin);
	}

	/**
	 * @return the forwardVector
	 */
	public Vector getForwardVector() {
		return forwardVector;
	}

	/**
	 * @param forwardVector the forwardVector to set
	 */
	public void setForwardVector(Vector forwardVector) {
		this.forwardVector = new Vector(forwardVector);
	}

	/**
	 * @return the upVector
	 */
	public Vector getUpVector() {
		return upVector;
	}

	/**
	 * @param upVector the upVector to set
	 */
	public void setUpVector(Vector upVector) {
		this.upVector = new Vector(upVector);
	}

	/**
	 * @return the rightVector
	 */
	public Vector getRightVector() {
		return rightVector;
	}

	/**
	 * @param rightVector the rightVector to set
	 */
	public void setRightVector(Vector rightVector) {
		this.rightVector = new Vector(rightVector);
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "PerspectiveCamera [origin=" + origin.toString() + ", forwardVector=" + forwardVector.toString() + ","
				+ " upVector=" + upVector.toString() + ", rightVector=" + rightVector.toString() + ", height=" + height + ", width=" + width + "]";
	}
	
	

}
