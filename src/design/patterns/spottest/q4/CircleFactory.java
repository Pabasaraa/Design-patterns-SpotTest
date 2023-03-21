package design.patterns.spottest.q4;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        return null;
    }
}
