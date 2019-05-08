/**
 * 
 */
package acsse.computer.graphics.ray.tracer.models;

import java.util.ArrayList;

import acsse.computer.graphics.ray.tracer.objects.Shape;

/**
 * @author SMG
 *
 */
public class ShapeList extends Shape {
	
	private ArrayList<Shape> shapes;
	
	public ShapeList() {
		
		shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape shape) {
		shapes.add(shape);
	}

	@Override
	public boolean intersect(Intersection intersection) {
		
		boolean intersecting = false;
		
		for (Shape s : shapes) {
			if(s.intersect(intersection)) {
				intersecting = true;
			}
		}
		return intersecting;
	}

	@Override
	public boolean doesIntersect(Ray ray) {
		
		for (Shape s : shapes) {
			if(s.doesIntersect(ray)) {
				return true;
			}
		}
		return false;
	}

}
