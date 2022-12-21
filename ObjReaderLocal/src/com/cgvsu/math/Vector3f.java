package com.cgvsu.math;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector3f {
    private static final float eps = 1e-7f;

    private final float x;
    private final float y;
    private final float z;


    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vector3f other) {
        // todo: желательно, чтобы это была глобальная константа
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps && Math.abs(z - other.z) < eps;
    }

    public float getX(){
        return x;
    }
    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
