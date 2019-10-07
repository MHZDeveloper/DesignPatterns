public class FactoryProducer {
    public static AbstractFactory getFactory(boolean angular) {
        if (angular) {
            return new AngularShapeFactory();
        } else {
            return new CircularShapeFactory();
        }
    }


    public static void main(String[] args) {
        AbstractFactory angularShapeFactory = FactoryProducer.getFactory(true);
        Shape shape1 = angularShapeFactory.getShape("RECTANGLE");
        shape1.createShape();

        AbstractFactory circularShapeFactory = FactoryProducer.getFactory(false);
        Shape shape2 = circularShapeFactory.getShape("CIRCLE");
        shape2.createShape();
    }
}