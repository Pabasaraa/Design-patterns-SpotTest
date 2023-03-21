package design.patterns.spottest.q4;

public class Main {
    public static void main(String[] args) {
        // create shape factories
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        // create circle object and call its draw method
        Shape circle = circleFactory.getShape("CIRCLE");
        circle.draw();

        // create rectangle object and call its draw method
        Shape rectangle = rectangleFactory.getShape("RECTANGLE");
        rectangle.draw();

        // create square object and call its draw method
        Shape square = squareFactory.getShape("SQUARE");
        square.draw();
    }
}
