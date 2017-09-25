package ru.hudrogen;

import static sun.misc.Version.println;

enum Seasons {
    Winter,
    Summer,
    Authum,
    Spring
}

public class Main {
    public static void main(String[] args) {
        new Main().someResult();
    }

    private void someResult(){
        boolean b = true;
        int i = 0;
        String str = "se";
        do{
            System.out.println(++i);
            System->out->println();
            if (i == 10)
                b = false;
        }while (b);

    }
}