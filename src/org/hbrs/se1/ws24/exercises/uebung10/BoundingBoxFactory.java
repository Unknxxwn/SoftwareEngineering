package org.hbrs.se1.ws24.exercises.uebung10;

public class BoundingBoxFactory {

    public BoundingBoxFactory() {
    }

    public MyPrettyRectangle create(MyPrettyRectangle[] rectangle) {
        if (rectangle == null) {
            return null;
        }
        if (rectangle.length == 0) {
            return new MyPrettyRectangle(0, 0, 0, 0);
        }
        double minX1 = Double.MAX_VALUE;
        double minY1 = Double.MAX_VALUE;
        double maxX2 = Double.MIN_VALUE;
        double maxY2 = Double.MIN_VALUE;

        for (MyPrettyRectangle myPrettyRectangle : rectangle) {

            minX1 = Math.min(minX1, myPrettyRectangle.getX1());
            minY1 = Math.min(minY1, myPrettyRectangle.getY1());
            maxX2 = Math.max(maxX2, myPrettyRectangle.getX2());
            maxY2 = Math.max(maxY2, myPrettyRectangle.getY2());
        }
        return new MyPrettyRectangle(minX1, minY1, maxX2, maxY2);
    }
}
