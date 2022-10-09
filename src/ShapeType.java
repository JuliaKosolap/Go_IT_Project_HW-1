public abstract class ShapeType implements Shape {

    private static Shape quad = new Quad();
    private static Shape triangle = new Triangle();
    private static Shape rectangle = new Rectangle();
    private static Shape elliplse = new Ellipse();

    private static Shape circle = new Circle();

    public Shape getCircle() {
        return circle;
    }

    public Shape getQuad() {
        return quad;
    }

    public Shape getTriangle() {
        return triangle;
    }

    public Shape getPolygon() {
        return rectangle;
    }

    public Shape getElliplse() {
        return elliplse;
    }

    public static String getShapeName(Shape shape) {
        if (shape.equals(triangle)) {
            return triangle.shapeName();
        } else if (shape.equals(elliplse)) {
            return elliplse.shapeName();
        } else if (shape.equals(rectangle)) {
            return rectangle.shapeName();
        } else if (shape.equals(quad)) {
            return quad.shapeName();
        } else if (shape.equals(circle)) {
            return circle.shapeName();
        }
        return null;
    }


}