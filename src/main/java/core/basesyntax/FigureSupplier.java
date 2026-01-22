package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double COEFFICIENT = 20.0;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String randomColor = this.colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(FIGURE_TYPES_COUNT);
        switch (randomNumber) {
            case 0:
                return new Circle(
                        randomColor,
                        "Circle",
                        random.nextDouble() * COEFFICIENT
                );
            case 1: return new IsoscelesTrapezoid(
                    randomColor,
                    "IsoscelesTrapezoid",
                    random.nextDouble() * COEFFICIENT,
                    random.nextDouble() * COEFFICIENT,
                    random.nextDouble() * COEFFICIENT
            );
            case 2: return new Rectangle(
                    randomColor,
                    "Rectangle",
                    random.nextDouble() * COEFFICIENT,
                    random.nextDouble() * COEFFICIENT
            );
            case 3: return new Square(
                    randomColor,
                    "Square",
                    random.nextDouble() * COEFFICIENT
            );
            case 4: return new RightTriangle(
                    randomColor,
                    "RightTriangle",
                    random.nextDouble() * COEFFICIENT,
                    random.nextDouble() * COEFFICIENT
            );
            default: return new Circle("white", "Circle", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", "Circle", 10);
    }

}
