package acsse.computer.graphics.ray.tracer.models;

public class Light {

    private LIGHT_TYPE light_type;
    private Vector lightVector;
    private Pixel pixel;

    /**
     * Constructor
     * @param light_type -- light type
     * @param vec -- vector
     * @param rgbColor -- red green blue value of a pixel
     */
    public Light (LIGHT_TYPE light_type, Vector vec, Pixel rgbColor){
        this.light_type = light_type;
        pixel = new Pixel(rgbColor);

        if (light_type == LIGHT_TYPE.DIRECTIONAL){
            lightVector = MathClass.normalize(vec);

        }else if(light_type == LIGHT_TYPE.POINT){
            lightVector = new Vector(vec);
        }
    }

    public LIGHT_TYPE getLight_type() {
        return light_type;
    }

    public void setLight_type(LIGHT_TYPE light_type) {
        this.light_type = light_type;
    }

    public Vector getLightVector() {
        return lightVector;
    }

    public void setLightVector(Vector lightVector) {
        this.lightVector = lightVector;
    }

    public Pixel getPixel() {
        return pixel;
    }

    public void setPixel(Pixel pixel) {
        this.pixel = pixel;
    }
}
