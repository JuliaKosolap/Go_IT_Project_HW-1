public class Circle implements Shape {
    private String name = "Circle";
    @Override
    public String shapeName() {
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o || this == o || this == o || this == o || this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return this.name.equals((circle.name));
    }
}
