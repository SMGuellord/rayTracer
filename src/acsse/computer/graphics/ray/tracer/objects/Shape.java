/**
 * 
 */
package acsse.computer.graphics.ray.tracer.objects;

import acsse.computer.graphics.ray.tracer.models.Intersection;
import acsse.computer.graphics.ray.tracer.models.Ray;

/**
 * @author SMG
 *
 */
public abstract class Shape {

	public abstract boolean intersect (Intersection intersection);
	public abstract boolean doesIntersect(final Ray ray);
}
