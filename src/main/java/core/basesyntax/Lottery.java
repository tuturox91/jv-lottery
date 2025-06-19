package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int RAND_LIMIT = 101;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        return new Ball(colorSupplier.getRandomColor(), (rand.nextInt(RAND_LIMIT)));
    }
}
