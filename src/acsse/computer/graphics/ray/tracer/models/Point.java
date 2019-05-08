package acsse.computer.graphics.ray.tracer.models;

public class Point {

    private float x;
    private float y;
    private float z;

    /**
     * constructor
     * @param x -- x coordinate
     * @param y -- y coordinate
     * @param z -- z coordinate
     */
    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(Point other) {
    	this.x = other.x;
        this.y = other.y;
        this.z = other.z;
	}

	public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    /**
     * Calculate the distance between two pofloats.
     * @param other -- other pofloat
     * @return return the distance between the two pofloat
     */
    public float calcDistance(Point other){
        return (float)Math.sqrt((other.x - x)*(other.x -x) + (other.y - y)*(other.y -y) + (other.z - z)*(other.z -z));
    }

    @Override
    public String toString() {
        return String.format("("+x+", "+y+", "+z+")");
    }
}
