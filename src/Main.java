import acsse.computer.graphics.ray.tracer.models.MathClass;
import acsse.computer.graphics.ray.tracer.models.Vector;

/**
 * 
 */


/**
 * @author sumba
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vec = new Vector(2, 3, 4);
		Vector vec2 = new Vector(4, 5, 6);
		
		MathClass math = new MathClass();
		
		System.out.println("Welcome to the Ray tracer Project \n\n");
		System.out.println("Vector1 = "+vec.toString());
		System.out.println("Normalized Vector1 = " +math.normalize(vec));
		
		System.out.println("\n Vector2 = "+vec2.toString());
		System.out.println("Normalized Vector2 = " +math.normalize(vec2));
		
		System.out.println("\n"+vec.toString() +" dot "+ vec2.toString() +" = " +math.dotProd(vec, vec2) );
		System.out.println(vec.toString() +" cross "+ vec2.toString() +" = " +math.crossProd(vec, vec2).toString() );
		System.out.println(vec.toString() +" add "+ vec2.toString() +" = "+math.addVec(vec, vec2).toString());
		System.out.println(vec.toString() +" sub "+ vec2.toString() +" = "+math.subVec(vec, vec2).toString());
	}

}
