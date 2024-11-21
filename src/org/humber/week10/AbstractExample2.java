package org.humber.week10;

abstract class Shape {

    private int edgeLength;

    public Shape(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public final int getEdgeLength() {
        return edgeLength;
    }

    abstract public double getArea(int edgeLength);

}

class Square extends Shape {

    public Square(int edgeLength) {
        super(edgeLength);
    }

    @Override
    public double getArea(int edgeLength) {
        return edgeLength * edgeLength;
    }

    public int getSideLength() {
        return getEdgeLength();
    }
}

class EquilateralTriangle extends Shape {

    public EquilateralTriangle() {
        super(12);
    }

    @Override
    public double getArea(int edgeLength) {
        return Math.sqrt(3) / 4 * edgeLength * edgeLength;
    }

    public int getSideLength() {
        return getEdgeLength();
    }
}


class Circle extends Shape {

    public Circle(int edgeLength) {
        super(edgeLength);
    }

    @Override
    public double getArea(int edgeLength) {
        return Math.PI * edgeLength * edgeLength;
    }

    public int getRadius() {
        return getEdgeLength();
    }
}


public class AbstractExample2 {

    public static void main(String[] args) {
        Shape unknown = new Shape(8) {
            @Override
            public double getArea(int edgeLength) {
                return edgeLength * 10;
            }

            public int getUnknownLength() {
                return -1;
            }
        };

        Shape square = new Square(5);
        Shape equilateralTriangle = new EquilateralTriangle();
        Shape circle = new Circle(7);

        Shape[] shapes = {unknown, square, equilateralTriangle, circle};

        printArea(shapes);
    }

    private static void printArea(Shape[] shapes) {
        for (Shape shape : shapes) {

            if(shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Radius: " + c.getRadius());
            } else if(shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("Side Length: " + s.getSideLength());
            } else if( shape instanceof EquilateralTriangle) {
                EquilateralTriangle e = (EquilateralTriangle) shape;
                System.out.println("Side Length: " + e.getSideLength());
            }

            System.out.println("Area: " + shape.getArea(shape.getEdgeLength()));
        }
    }

}
