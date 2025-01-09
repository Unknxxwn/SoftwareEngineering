package org.hbrs.se1.ws24.exercises.uebung10;

public class MyPoint {
    private double x;
    private double y;

    @Override
    public String toString() {
        return "MyPoint [x=" + this.x + ", y=" + this.y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MyPoint)) {
            return false;
        }
        MyPoint object = (MyPoint) obj;
        if (this.getX() == object.getX() && this.getY() == object.getY()) {
            return true;
        }
        return false;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
