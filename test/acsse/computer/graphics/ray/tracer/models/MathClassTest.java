package acsse.computer.graphics.ray.tracer.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathClassTest {

    Vector vector1 = new Vector(2, 3, 4);
    Vector vector2 = new Vector(4, 5, 6);

    MathClass math = new MathClass();
    @Test
    void dotProd() {
        assertEquals(47.0f, math.dotProd(vector1, vector2));
    }
    private void assertHelper(Vector v, Vector u){
        assertEquals(v.getX(),u.getX() );
        assertEquals(v.getY(), u.getY());
        assertEquals(v.getZ(), u.getZ());
    }

    @Test
    void crossProd() {
        Vector v = new Vector(-2f, 4f, -2f);
        Vector u = math.crossProd(vector1, vector2);
        assertHelper(v,u);
    }

    @Test
    void calcMagnitude() {
        assertEquals((float) Math.sqrt(29.f), math.calcMagnitude(vector1));
    }

    @Test
    void normalize() {
        Vector v = new Vector(0.45584232f, 0.5698029f, 0.6837635f);
        Vector u = math.normalize(vector2);
        assertHelper(v,u);
    }

    @Test
    void addVec() {
        Vector v = new Vector(6, 8, 10);
        Vector u = math.addVec(vector1, vector2);
        assertHelper(v,u);
    }

    @Test
    void subVec() {
        Vector v = new Vector(-2, -2, -2);
        Vector u = math.subVec(vector1, vector2);
        assertHelper(v,u);
    }
}