package oop_lesson_2;

public class Rectangle extends aFigure {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
