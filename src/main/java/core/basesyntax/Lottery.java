package core.basesyntax;

import java.util.Random;

public  class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();

        ColorSupplier _supplier = new ColorSupplier();
        return new Ball(_supplier.getRandomColor(), random.nextInt(100));
    }
}
