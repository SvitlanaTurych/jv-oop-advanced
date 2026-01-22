package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String randomColor = this.colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return new Circle(
                        randomColor,
                        "Circle",
                        random.nextDouble() * 20
                );
            case 1: return new IsoscelesTrapezoid(
                    randomColor,
                    "IsoscelesTrapezoid",
                    random.nextDouble() * 20,
                    random.nextDouble() * 20,
                    random.nextDouble() * 20
            );
            case 2: return new Rectangle(
                    randomColor,
                    "Rectangle",
                    random.nextDouble() * 20,
                    random.nextDouble() * 20
            );
            case 3: return new Square(
                    randomColor,
                    "Square",
                    random.nextDouble() * 20
            );
            case 4: return new RightTriangle(
                    randomColor,
                    "RightTriangle",
                    random.nextDouble() * 20,
                    random.nextDouble() * 20
            );
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", "Circle", 10);
    }

}
