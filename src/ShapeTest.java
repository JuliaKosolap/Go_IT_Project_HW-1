public class ShapeTest {
    public static void main(String[] args) {
     CreateShape createShape = new CreateShape();
     Shape rectangle = new Rectangle();
     Shape triangle = new Triangle();
     Shape circle = new Circle();
     Shape ellipse = new Ellipse();
     Shape quad = new Quad();
     createShape.create(rectangle);
     createShape.create(triangle);
     createShape.create(circle);
     createShape.create(ellipse);
     createShape.create(quad);
    }
}
