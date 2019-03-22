package acsse.computer.graphics.ray.tracer.models;

public class Point {

    private int x;
    private int y;
    private int z;

    /**
     * constructor
     * @param x -- x coordinate
     * @param y -- y coordinate
     * @param z -- z coordinate
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Calculate the distance between two points.
     * @param other -- other point
     * @return return the distance between the two point
     */
    public float calcDistance(Point other){
        return (float)Math.sqrt((other.x - x)*(other.x -x) + (other.y - y)*(other.y -y) + (other.z - z)*(other.z -z));
    }

    @Override
    public String toString() {
        return String.format("("+x+", "+y+", "+z+")");
    }
}
