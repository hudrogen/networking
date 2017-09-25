package ru.hudrogen.entity;

/** Ships location on the battle field
 * x - chars axis 0-9 (instead a-j in this layer), y - numbers axis 0-9*/
public class Location {
    private int x;
    private int y;

    //TODO с этими эксепшенами код выглядит не очень, возможно переделать. Но это не точно
    public Location(int x, int y) {
        if (x > 0 && x < 10) {
            this.x = x;
        } else throw new IndexOutOfBoundsException("For X only 0-9, not " + "\"" + x + "\"");
        if (y >= 0 && y < 10) {
            this.y = y;
        } else throw new IndexOutOfBoundsException("For Y only 0-9, not " + "\"" + y + "\"");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location is(" + x + y + ")";
    }
}
