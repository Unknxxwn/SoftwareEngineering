package org.hbrs.se1.ws24.exercises.uebung10;

public class MyPrettyRectangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    @Override
    public String toString() {
        return "MyPrettyRectangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
    }

    public MyPrettyRectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean contains(MyPrettyRectangle rectangle) {
        // bei Punkt(x1,y2) darf der andere punkt nicht kleiner sein
        // bei Punkt2(x2,y2) darf der punkt nicht größer sein!
        if (this.x1 <= rectangle.getX1() &&
                this.y1 <= rectangle.getY1() &&
                this.x2 >= rectangle.getX2() &&
                this.y2 >= rectangle.getY2()) {
            return true;
        }
        return false;
    }

    public MyPoint getCenter() {
        // center(x,y)=(x1+x2/2,y1+y2/2);
        double x = (this.x1 + this.x2) / 2;
        double y = (this.y1 + this.y2) / 2;
        return new MyPoint(x, y);
    }

    public double getArea() {
        // a ist die vertikale Strecke ,also X achse von Punkt 1 zu Punkt 2
        // b ist die horizontale Strecke, also y achse zwischen P1 und P2
        double a = this.x2 - this.x1;
        double b = this.y2 - this.y1;
        return a * b;
    }

    public double getPerimeter() {
        // umfang = 2*a+2*b
        double a = this.x2 - this.x1;
        double b = this.y2 - this.y1;
        return 2 * (a + b);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MyPrettyRectangle)) {
            return false;
        }
        MyPrettyRectangle object = (MyPrettyRectangle) obj;
        if (this.x1 == object.getX1() && this.y1 == object.getY1() && this.x2 == object.getX2()
                && this.y2 == object.getY2()) {
            return true;
        }
        return false;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

}
