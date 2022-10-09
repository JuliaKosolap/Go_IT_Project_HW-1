public class Ellipse implements Shape{
    private String name = "Ellipse";

    @Override
    public String shapeName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || this == o || this == o || this == o || this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return this.name.equals((ellipse.name));
    }
}
