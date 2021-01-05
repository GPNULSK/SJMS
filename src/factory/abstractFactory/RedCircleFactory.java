package factory.abstractFactory;

public class RedCircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new RedColor();
    }
}
