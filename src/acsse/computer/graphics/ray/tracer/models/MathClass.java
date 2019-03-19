package acsse.computer.graphics.ray.tracer.models;


public class MathClass {
	
	/**
	 * Constructor.
	 */
	public MathClass() {}
	
	
	/**
	 * Calculate the dot product of a vector.
	 * @param vec1 -- vector 1
	 * @param vec2 -- vector 2
	 * @return result of the dot product
	 */
	public final float dotProd(Vector vec1, Vector vec2) {
	
		return vec1.getX() * vec2.getX() + vec1.getY()  * vec2.getY() + vec1.getZ() * vec2.getZ();
		
	}
	
	/**
	 * Calculate the cross product of a vector.
	 * @param vec1 -- vector 1
	 * @param vec2 --vector 2
	 * @return resultant vector
	 */
	public final Vector crossProd(Vector vec1, Vector vec2) {
		
		return new Vector ( vec1.getY() * vec2.getZ() - vec1.getZ() * vec2.getY(),
							vec1.getZ() * vec2.getX() - vec1.getX() * vec2.getZ(), 
							vec1.getX() * vec2.getY() - vec1.getY() * vec2.getX());
	}

	
	/**
	 * Calculate the magnitude of a vector
	 * @param vector
	 * @return the magnitude of the vector.
	 */
	public final float calcMagnitude(Vector vector) {
		
		return  (float) Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
		
	}
	
	/**
	 * Normalize a vector.
	 * @param vector vector to be normalized
	 * @return normalized vector
	 */
	public final Vector normalize(Vector vector) {
		
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
	public Vector addVec ( Vector vec1, Vector vec2){

		return new Vector( vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY(), vec1.getZ() + vec2.getZ());
	}

	public Vector subVec (Vector vec1, Vector vec2){
		return  new Vector( vec1.getX() - vec2.getX(), vec1.getY() - vec2.getY(), vec1.getZ() - vec2.getZ());
	}
	
}
