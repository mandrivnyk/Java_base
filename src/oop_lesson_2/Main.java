package oop_lesson_2;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getSquare());

        Rectangle rectangle = new Rectangle(10, 2);
        System.out.println(rectangle);
        System.out.println(rectangle.getSquare());

        Square square = new Square(3);
        System.out.println(square);
        System.out.println(square.getSquare());

        FigureList figureList = new FigureList();
        figureList.addFigure(circle);
        figureList.addFigure(rectangle);
        figureList.addFigure(square);

        figureList.deleteFigure(1);
        System.out.println(figureList.findFigureWithSquare(30));
    }

}
