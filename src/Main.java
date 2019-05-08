import acsse.computer.graphics.ray.tracer.models.Colour;
import acsse.computer.graphics.ray.tracer.models.Image;
import acsse.computer.graphics.ray.tracer.models.Intersection;
import acsse.computer.graphics.ray.tracer.models.MathClass;
import acsse.computer.graphics.ray.tracer.models.Ray;
import acsse.computer.graphics.ray.tracer.models.ShapeList;
import acsse.computer.graphics.ray.tracer.models.Vector;
import acsse.computer.graphics.ray.tracer.models.Vector2D;
import acsse.computer.graphics.ray.tracer.objects.Camera;
import acsse.computer.graphics.ray.tracer.objects.InfinitePlane;
import acsse.computer.graphics.ray.tracer.objects.PerspectiveCamera;
import acsse.computer.graphics.ray.tracer.objects.Shape;
import acsse.computer.graphics.ray.tracer.objects.Sphere;

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
		ShapeList scene = new ShapeList();
		
		int imgWidth = 1920;
		int imgHeight = 1000;
		
		Image image = new Image(imgWidth, imgHeight);
		
		PerspectiveCamera camera = new PerspectiveCamera (new Vector(-5.0f, 1.0f, 0.0f), new Vector(0.0f, 1.0f, 0.0f), new Vector(), (float) (25.0f *3.14/180.0f), (float)imgWidth/(float)imgHeight);
		
		InfinitePlane plane = new InfinitePlane(new Vector(0.0f, 0.0f, 0.0f), new Vector(), new Colour(0.5f, 1.0f, 0.5f));
		scene.add(plane);
		
		Sphere sphere = new Sphere(new Vector(0.0f, 1.0f, 0.0f), 1.0f, new Colour(0.5f, 0.5f, 1.0f));
		scene.add(sphere);
		
		rayTrace(image, camera, scene);
	}
	
	public static void rayTrace(Image image, Camera camera, Shape scene) {
		for (int w = 0; w < image.getImgWidth(); w++) {
			for (int h = 0; h < image.getImgHeight(); h++) {
				Vector2D vector2D = new Vector2D((2.0f * w)/image.getImgWidth() - 1.0f, (-2.0f * h)/image.getImgHeight() + 1.0f);
				Ray ray = camera.shootRay(vector2D);
				Colour thisPixel = image.getPixel(w, h);
				
				Intersection intersection = new Intersection(ray);
				if(scene.intersect(intersection)) {
					thisPixel = intersection.getColour();
				}else {
					thisPixel = new Colour(0.0f);
				}
			}
		}
		
	}

}
