package ru.hudrogen.entity;

import org.junit.Test;

public class BattleFieldTest {
    @Test
    public void testDisplayingBattlefield(){
        BattleField field = new BattleField();
        System.out.println(field.toString());
    }

    @Test
    public void testLaunchShip() throws Exception {
        Location begin = new Location(1, 1);
        Location end = new Location(1, 4);
        Ship ship = new Ship(begin, end);

        Location begin2 = new Location(4, 1);
        Location end2 = new Location(4, 4);
        Ship ship2 = new Ship(begin2, end2);

        BattleField field = new BattleField();
        field.launchShip(ship);
        field.launchShip(ship2);
        System.out.println(field.toString());


    }
}
