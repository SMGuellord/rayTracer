package acsse.computer.graphics.ray.tracer.models;

/**
 * this class contains operations that can be performed on vectors.
 * This operations include the dot product, cross product, add, substract, normalize.
 */
public class MathClass {

	
	/**
	 * Calculate the dot product of a vector.
	 * @param vec1 -- vector 1
	 * @param vec2 -- vector 2
	 * @return result of the dot product
	 */
	public static final float dotProd(Vector vec1, Vector vec2) {
	
		return vec1.getX() * vec2.getX() + vec1.getY() * vec2.getY() + vec1.getZ() * vec2.getZ();
		
	}
	
	/**
	 * Calculate the cross product of a vector.
	 * @param vec1 -- vector 1
	 * @param vec2 --vector 2
	 * @return resultant vector
	 */
	public static final Vector crossProd(Vector vec1, Vector vec2) {
		
		return new Vector ( vec1.getY() * vec2.getZ() - vec1.getZ() * vec2.getY(),
							vec1.getZ() * vec2.getX() - vec1.getX() * vec2.getZ(), 
							vec1.getX() * vec2.getY() - vec1.getY() * vec2.getX());
	}

	public static final float squaredSum(Vector vector) {
		return vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ();
	}
	
	/**
	 * Calculate the magnitude of a vector
	 * @param vector
	 * @return the magnitude of the vector.
	 */
	public static final float calcMagnitude(Vector vector) {
		
		return  (float) Math.sqrt(squaredSum(vector));
		
	}
	
	/**
	 * Normalize a vector.
	 * @param vector vector to be normalized
	 * @return normalized vector
	 */
	public static final Vector normalize(Vector vector) {
		
		// The normal of a vector = vector divided by the magnitude of the vector.
		float magnitude = calcMagnitude(vector);
		float inverseMagnitude = 0f;
		
		//Check division by zero
		if (magnitude != 0) 
			inverseMagnitude = 1/magnitude;
		
		return new Vector ( vector.getX() * inverseMagnitude,
							vector.getY() * inverseMagnitude,
							vector.getZ() * inverseMagnitude);
	}

	/**
	 * Add two vector together.
	 * @param vec1 vector 1
	 * @param vec2 vector 2
	 * @return resultant vector.
	 */
	public static Vector add ( Vector vec1, Vector vec2){

		return new Vector( vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY(), vec1.getZ() + vec2.getZ());
	}

	public static Vector sub (Vector vec1, Vector vec2){
		return  new Vector( vec1.getX() - vec2.getX(), vec1.getY() - vec2.getY(), vec1.getZ() - vec2.getZ());
	}

	public static Vector div(Vector vec, float f) {
		
		return new Vector(vec.getX()/f, vec.getY()/f, vec.getZ()/f);		
	}
	
}
