package core.basesyntax;

public class RightTriangle extends Figure {
    private final double leg;
    private double height;

    public RightTriangle(String color, String name, double leg, double height) {
        this.setColor(color);
        this.setName(name);
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {

        return (leg * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, leg: " + leg + " units, color: " + getColor());
    }
}
