package ru.hudrogen.entity;

import java.util.Arrays;
import java.util.List;

/**
 * Originally, battle field should look like this
 * a,b,c,d,e,f,g,h,i,j
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * But in this class we use number instead of character like this for simplicity
 * 0,1,2,3,4,5,6,7,8,9
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9*/
public class BattleField {

    private int[][] field = new int[10][10];

    /**Empty field initialized with 0 */
    public BattleField(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = 0;
            }
        }
    }

    /**Currently, here is only method to put you ship into field array without checking the boundaries for other ships*/
    public void launchShip(Ship ship){
        //TODO тут сложный алгоритм по расстановке кораблей на поле боя
        switch (ship.getOrientation()){
            case HORIZONTAL:{
                for (int i = (ship.getBeginLocation().getX()); i <= (ship.getEndLocation().getX()); i++) {
                    field[ship.getBeginLocation().getY()][i] = 1;
                }
            }
            case VERTICAl:{
                for (int i = ship.getBeginLocation().getY(); i <= ship.getEndLocation().getY(); i++) {
                    field[i][ship.getBeginLocation().getX()] = 1;
                }
            }
        }
    }

    public void launchShips(List<Ship> ships){
        for (Ship ship : ships) {
            launchShip(ship);
        }
    }

    /** Checking whether ship can launch in desired position in field
     * Between ships must be at least 1 cell*/
    private boolean shipCanLaunch(Ship ship){
        int fixLine;
        switch (ship.getOrientation()){
            case HORIZONTAL:

            case VERTICAl:
        }
        //проверка наложения
        for (int i = 0; i < ship.getSize(); i++) {
            //TODO тут продолжить проверку
            //field[][]
        }
        return false;
    }

    /**Display battle field as matrix*/
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            res.append(Arrays.toString(field[i]) + "\n");
        }
        return String.valueOf(res);
    }
}
