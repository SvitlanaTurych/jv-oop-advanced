package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier supplier = new FigureSupplier(colorSupplier);
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }

}
