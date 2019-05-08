package acsse.computer.graphics.ray.tracer.objects;

import acsse.computer.graphics.ray.tracer.models.Ray;
import acsse.computer.graphics.ray.tracer.models.Vector2D;

public abstract class Camera {
	
	public abstract Ray shootRay(Vector2D point);
}
