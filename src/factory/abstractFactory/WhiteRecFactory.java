package factory.abstractFactory;

public class WhiteRecFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new WhiteColor();
    }
}
