package design.patterns.spottest.q4;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }
}
