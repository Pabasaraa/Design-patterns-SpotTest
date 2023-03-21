package design.patterns.spottest.q4;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
