package acsse.computer.graphics.ray.tracer.models;

public class Pixel {

    private int red;
    private int green;
    private int blue;

    /**
     * Constructor
     * */
    public Pixel(){
        red = 255;
        green = 255;
        blue = 255;
    }

    /**
     * Constructor with 3 rgb values as parameters
     * @param red  -- red color
     * @param green -- green color
     * @param blue -- blue color
     */
    public Pixel(int red, int green, int blue){

        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Copy constructor
     * @param otherPixel -- another instance of a pixel
     */
    public Pixel (Pixel otherPixel){
        this.red = otherPixel.red;
        this.green = otherPixel.green;
        this.blue = otherPixel.blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
