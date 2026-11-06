package Module05.shapes;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double l, Double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}