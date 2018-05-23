package oop_lesson_2;

public class Circle extends aFigure {
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 2 * Math.PI * radius;
    }
}
