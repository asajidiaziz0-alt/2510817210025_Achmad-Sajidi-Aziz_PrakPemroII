package Module05.shapes;

public class Cylinder extends Shape {
    private Double radius;
    private Double height;

    public Cylinder(Double r, Double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (height + radius);
    }
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
