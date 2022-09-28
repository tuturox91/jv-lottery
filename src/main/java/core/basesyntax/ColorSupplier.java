package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        Random random = new Random(); //random obj

        MyColors[] allColors = MyColors.values(); //all colors form enum to array

        return allColors[random.nextInt(allColors.length)].toString(); //random int and get color from array then convert toString
    }
}
