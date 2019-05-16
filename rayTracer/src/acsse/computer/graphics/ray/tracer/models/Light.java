package acsse.computer.graphics.ray.tracer.models;

public class Light {

    private LIGHT_TYPE light_type;
    private Vector lightVector;
    private Colour pixel;

    /**
     * Constructor
     * @param light_type -- light type
     * @param vec -- vector
     * @param rgbColor -- red green blue value of a pixel
     */
    public Light (LIGHT_TYPE light_type, Vector vec, Colour rgbColor){
        this.light_type = light_type;
        pixel = new Colour(rgbColor);

        if (light_type == LIGHT_TYPE.DIRECTIONAL){
            lightVector = new Vector(MathClass.normalize(vec));

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
        this.lightVector = new Vector(lightVector);
    }

    public Colour getPixel() {
        return pixel;
    }

    public void setPixel(Colour pixel) {
        this.pixel = new Colour(pixel);
    }
}
