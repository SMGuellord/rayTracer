package acsse.computer.graphics.ray.tracer.objects;

import acsse.computer.graphics.ray.tracer.models.Colour;
import acsse.computer.graphics.ray.tracer.models.Intersection;
import acsse.computer.graphics.ray.tracer.models.MathClass;
import acsse.computer.graphics.ray.tracer.models.Ray;
import acsse.computer.graphics.ray.tracer.models.Vector;

public class Sphere extends Shape{
	
	private Vector center;
	private float radius;
	private Colour colour;
	
	public Sphere(final Vector center, final float radius, Colour colour) {
		this.center = new Vector (center);
		this.radius = radius;
		this.colour = new Colour(colour);
	}

	/**
	 * @return the center
	 */
	public Vector getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Vector center) {
		this.center = center;
	}

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
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

	@Override
	public boolean intersect(Intersection intersection) {
		
		Ray thisRay = intersection.getRay();
		thisRay.setpOrigin(MathClass.sub(thisRay.getpOrigin(), center));
		
		// Determine quadratic coefficients
		
		float a = MathClass.squaredSum(thisRay.getDir());
		float b = 2 * MathClass.dotProd(thisRay.getDir(), thisRay.getpOrigin());
		float c = MathClass.squaredSum(thisRay.getpOrigin()) - radius*radius;
		
		float d = b*b - 4 * a * c;
		if(d < 0.0f) {
			return false; // the ray does not intersect the sphere.
		}
		
		//Determine the 2 points of intersections t1 and t2
		
		float t1 = (float) ((-b - Math.sqrt(d))/ 2*a);
		float t2 = (float) ((-b + Math.sqrt(d))/ 2*a);
		
		if(t1 > intersection.getRay().getT_MIN() && t2 < intersection.getT()) {
			intersection.setT(t2);
		}else {
			return false;
		}
		
		// add the shape to the shape collection
		intersection.setShape(this);
		intersection.setColour(colour);
		
		return true;
	}

	@Override
	public boolean doesIntersect(Ray ray) {
		Ray thisRay = new Ray(ray);
		thisRay.setpOrigin(MathClass.sub(thisRay.getpOrigin(), center));
		
		// Determine quadratic coefficients
		
		float a = MathClass.squaredSum(thisRay.getDir());
		float b = 2 * MathClass.dotProd(thisRay.getDir(), thisRay.getpOrigin());
		float c = MathClass.squaredSum(thisRay.getpOrigin()) - radius*radius;
		
		float d = b*b - 4 * a * c;
		if(d < 0.0f) {
			return false; // the ray does not intersect the sphere.
		}
		
		float t1 = (float) ((-b - Math.sqrt(d))/ 2*a);
		float t2 = (float) ((-b + Math.sqrt(d))/ 2*a);
		
		if(t1 > thisRay.getT_MIN() && t2 < thisRay.getT_MAX()) {
			return true;
		}

		if (t2 > thisRay.getT_MIN() && t2 < thisRay.getT_MAX()) {
			return true;
		}
		return false;
	}
}
