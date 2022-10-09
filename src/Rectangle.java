public class Rectangle implements Shape{
    private String name = "Polygon";
    @Override
    public String shapeName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || this == o || this == o || this == o || this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return this.name.equals((rectangle.name));
    }
}
