package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random rand = new Random();
    private final Colors[] colors = Colors.values();


    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)].name();
    }
}
