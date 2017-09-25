package ru.hudrogen.entity;

import org.junit.Test;

public class ShipTest {

    @Test
    public void testCreatingShip() throws Exception {
        Location begin = new Location(1, 1);
        Location end = new Location(2, 1);
        //3-х палубный получается
        Ship ship = new Ship(begin, end);
        System.out.println(ship.getSize());
        System.out.println(ship.getOrientation());
        System.out.println(ship.getBeginLocation());
        System.out.println(ship.getEndLocation());
    }

}
