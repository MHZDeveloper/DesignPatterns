public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }


    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.createShape();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.createShape();
        Shape square = shapeFactory.getShape("SQUARE");
        square.createShape();
    }
}
