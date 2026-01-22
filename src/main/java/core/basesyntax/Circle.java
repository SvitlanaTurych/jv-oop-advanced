package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private static final double PI = 3.14;

    public Circle(String color, String name, double radius) {
        this.setColor(color);
        this.setName(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
