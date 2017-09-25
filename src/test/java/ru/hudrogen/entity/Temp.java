package ru.hudrogen.entity;

import static org.junit.Assert.*;

public class Temp {
    static String text = "JavaRush. Learn once — use anywhere";
    public static void main(String[] args) {


        run();
    }

    public static void run() {
        for(int i = 0; i<10; i++ ){
            System.out.println(text);
        }
        //assertArrayEquals();
    }
}
