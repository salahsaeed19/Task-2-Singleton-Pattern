package shapes_singleton;

public class Main {
    
    public static void main(String[] args) {
        
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape("circle", 5);
        Shape square = factory.createShape("square", 10);
        Shape rectangle = factory.createShape("rectangle", 5, 10);
        Shape triangle = factory.createShape("triangle", 3, 4);

        System.out.println("Circle area: " + circle.calculateArea()); // should print 78.5398...
        System.out.println("Square area: " + square.calculateArea()); // should print 100.0...
        System.out.println("Rectangle area: " + rectangle.calculateArea()); // should print 50.0...
        System.out.println("Triangle area: " + triangle.calculateArea()); // should print 6.0...
        
    }
    
}
