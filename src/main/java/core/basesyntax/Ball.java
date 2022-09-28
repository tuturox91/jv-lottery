package core.basesyntax;

public class Ball {
    String _colorName;
    int _number;

    public Ball(String colorName, int number) {
        this._colorName = colorName;
        this._number = number;
    }

    @Override
    public String toString() { //to string
        return String.format("Color:%s Number:%d", _colorName, _number);
    }

}
