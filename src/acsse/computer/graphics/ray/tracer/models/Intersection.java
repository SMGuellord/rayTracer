/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

import acsse.computer.graphics.ray.tracer.objects.Shape;

/**
 * @author SMG
 *
 */
public class Intersection {

	private Ray ray;
	private float t;
	/**
	 * @return the ray
	 */
	public Ray getRay() {
		return ray;
	}

	/**
	 * @param ray the ray to set
	 */
	public void setRay(Ray ray) {
		this.ray = ray;
	}

	/**
	 * @return the t
	 */
	public float getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(float t) {
		this.t = t;
	}

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @return the colour
	 */
	public Colour getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}

	private Shape shape;
	private Colour colour;
	
	public Intersection() {
		ray = new Ray();
		t = ray.getT_MAX();
		shape = null;
	}
	
	public Intersection(final Intersection intersection) {
		ray = new Ray(intersection.ray);
		t = intersection.getT();
		shape = intersection.getShape();
	}
	
	public Intersection(final Ray ray) {
		this.ray = new Ray(ray);
		this.t = ray.getT_MAX();
		this.shape = null;
	}
	
	final public boolean intersected() {
		return shape != null;
	}
	
	final Vector position () {
		return ray.calculate(t);
	}
	
	
	
}
