package Module8;

public class ShapeTest {
    public static void main(String[] args) {
     CreateShape createShape = new CreateShape();
     Shape rectangle = new Rectangle();
     Shape triangle = new Triangle();
     Shape circle = new Circle();
     Shape ellipse = new Ellipse();
     Shape quad = new Quad();
     System.out.println(createShape.create(rectangle));
     System.out.println(createShape.create(triangle));
     System.out.println(createShape.create(circle));
     System.out.println(createShape.create(ellipse));
     System.out.println(createShape.create(quad));
    }
}
