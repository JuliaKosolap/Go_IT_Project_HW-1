public class Quad implements Shape{

    private String name = "Quad";
    @Override
    public String shapeName() {
        return "Quad";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o || this == o || this == o || this == o || this == o) {return true;}
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return this.name.equals((quad.name));
    }
}
