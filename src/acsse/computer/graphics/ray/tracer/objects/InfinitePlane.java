package acsse.computer.graphics.ray.tracer.objects;

import acsse.computer.graphics.ray.tracer.models.Colour;
import acsse.computer.graphics.ray.tracer.models.Intersection;
import acsse.computer.graphics.ray.tracer.models.MathClass;
import acsse.computer.graphics.ray.tracer.models.Ray;
import acsse.computer.graphics.ray.tracer.models.Vector;

public class InfinitePlane extends Shape{

	private Vector pos;
	private Vector normal;
	private Colour colour;
	
	
	public InfinitePlane (final Vector pos, final Vector normal, final Colour colour) {
		this.pos = new Vector(pos);
		this.normal = new Vector (normal);
		this.colour = new Colour(colour); // black colour
	}
	@Override
	public boolean intersect(Intersection intersection) {
		
		float dirDotNorm = MathClass.dotProd(intersection.getRay().getDir(), normal);
		//Check if we intersect the plane
		if(dirDotNorm == 0.0f) { 
			return false; // The ray does not intersect the plane.
		}
		
		// Determine the point of intersection
		float t = MathClass.dotProd(MathClass.sub(pos, intersection.getRay().getpOrigin()), normal);
		if(t <= intersection.getRay().getT_MIN() || t >= intersection.getT()) {
			return false; // the intersection is out of the desired range
		}
		
		intersection.setT(t);
		intersection.setShape(this);
		intersection.setColour(colour);
		
		return true;
	}

	@Override
	public boolean doesIntersect(Ray ray) {
		
		float dirDotNorm = MathClass.dotProd(ray.getDir(), normal);
		//Check if we intersect the plane
		if(dirDotNorm == 0.0f) { 
			return false; // The ray does not intersect the plane.
		}
		
		// Determine the point of intersection
		float t = MathClass.dotProd(MathClass.sub(pos, ray.getpOrigin()), normal);
		if(t <= ray.getT_MIN() || t >= ray.getT_MAX()) {
			return false; // the intersection is out of the desired range
		}
		
		return true;
	}
}
