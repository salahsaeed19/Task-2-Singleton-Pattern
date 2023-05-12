package shapes_singleton;

public class ShapeFactory {
    
    private static ShapeFactory instance;

    private ShapeFactory() {
        // Private constructor to prevent instantiation from outside
    }

    public static ShapeFactory getInstance() {
        
        if (instance == null) {
            instance = new ShapeFactory();
        }
        
        return instance;
        
    }

    public Shape createShape(String type, double... params) {
        
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params[0]);
            case "square":
                return new Square(params[0]);
            case "rectangle":
                return new Rectangle(params[0], params[1]);
            case "triangle":
                return new Triangle(params[0], params[1]);
            default:
                throw new IllegalArgumentException("Invalid shape type: " + type);
        }
        
    }
    
}
