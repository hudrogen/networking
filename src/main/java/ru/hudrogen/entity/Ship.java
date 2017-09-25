package ru.hudrogen.entity;

import java.util.List;


/** Ship should know all information about itself, so we have here size, orientation fields*/
public class Ship {

    private int size;
    private Location beginLocation;
    private Location endLocation;
    private ShipOrientation orientation;

    public static long main(String[] args) {
        return 10L;
    }

    public Ship(Location beginLocation, Location endLocation) throws Exception {
        this.beginLocation = beginLocation;
        this.endLocation = endLocation;

        if (beginLocation.getX() == endLocation.getX()){
            orientation = ShipOrientation.VERTICAl;
            size = endLocation.getY() - beginLocation.getY() + 1;

        }
        else if (beginLocation.getY() == endLocation.getY()){
            orientation = ShipOrientation.HORIZONTAL;
            size = endLocation.getX() - beginLocation.getX() + 1;
        }
        else {
            throw new Exception("This kind of ship cannot be created");
        }
    }

    public ShipOrientation getOrientation() {
        return orientation;
    }

    public int getSize() {
        return size;
    }


    public Location getBeginLocation() {
        return beginLocation;
    }


    public Location getEndLocation() {
        return endLocation;
    }


}
