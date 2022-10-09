public class Triangle implements Shape{
    private String name = "Triangle";
    @Override
    public String shapeName() {
        return "Triangle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || this == o || this == o || this == o || this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return this.name.equals((triangle.name));
    }
}
