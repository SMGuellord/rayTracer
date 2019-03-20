package acsse.computer.graphics.ray.tracer.models;

public class Transforms {

    public static Vector rotateAboutX(float angle, Vector vec){

        float sin = (float)Math.sin(angle);
        float cos = (float)Math.cos(angle);
        float Y = vec.getY()* cos + vec.getZ() * (-sin);
        float Z = vec.getY()* sin + vec.getZ() * cos;

        return new Vector(vec.getX(), Y, Z);
    }

    public static Vector rotateAboutY(float angle, Vector vec){

        float sin = (float)Math.sin(angle);
        float cos = (float)Math.cos(angle);
        float X = vec.getX()* cos + vec.getY() * sin;
        float Z = vec.getX()* (-sin) + vec.getZ() * cos;

        return new Vector(X, vec.getY(), Z);
    }

    public static Vector rotateAboutZ(float angle, Vector vec){
        float sin = (float)Math.sin(angle);
        float cos = (float)Math.cos(angle);
        float X = vec.getX()* cos + vec.getY() * (-sin);
        float Y = vec.getX()* sin + vec.getY() * cos;

        return new Vector(X, Y, vec.getZ());
    }

    public Vector scale (float scalar, Vector vec){
        return new Vector(scalar * vec.getX(), scalar * vec.getY(), scalar * vec.getZ() );
    }

    public Vector negateVector ( Vector vector){
        return new Vector(scale(-1, vector));
    }
}
