package com.cgvsu.math;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector2f {

    private static final float eps = 1e-7f;

    private final double x;
    private final double y;


    public Vector2f(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Vector2f other) {
        // todo: желательно, чтобы это была глобальная константа
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y)<eps;
    }

    public double getX(){
        return x;
    }
    public double getY() {
        return y;
    }

}
